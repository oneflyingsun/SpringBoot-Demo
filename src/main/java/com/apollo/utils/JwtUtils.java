package com.apollo.utils;


import com.apollo.business.exception.TokenException;
import org.apache.log4j.Logger;
import io.jsonwebtoken.*;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;


public final class JwtUtils {

    private static final Logger logger = Logger.getLogger(JwtUtils.class);

    //Sample method to construct a JWT
    public static String createJWT(String issuer, String subject, long ttlMillis, String secret) {

        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secret);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        JwtBuilder builder = Jwts.builder()
                .setIssuedAt(now)
                .setSubject(subject)
                .setIssuer(issuer)
                .signWith(signatureAlgorithm, signingKey);

        // 设置过期时间
        if (ttlMillis > 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }

        return builder.compact();
    }

    public static String parseJWT(String jwt, String secret) throws TokenException {

        String subject;

        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(secret))
                    .parseClaimsJws(jwt).getBody();

            logger.info(claims.toString());

            logger.debug("Subject: " + claims.getSubject());
            logger.debug("Issuer: " + claims.getIssuer());
            logger.debug("Expiration: " + claims.getExpiration());
            logger.debug("issueAt: " + claims.getIssuedAt());

            subject = claims.getSubject();
        } catch (ExpiredJwtException exJwt) {
            String errorMsg = "jwt时间过期";
            logger.error(errorMsg, exJwt);
            throw new TokenException(errorMsg);
        } catch (Exception e) {
            String errorMsg = "jwt验签异常";
            logger.error(errorMsg, e);
            throw new TokenException(errorMsg);
        }
        return subject;

    }


}
