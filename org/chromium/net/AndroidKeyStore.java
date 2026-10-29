package org.chromium.net;

import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p000.zi4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                String string = e.toString();
                StringBuilder sbM13625y = zi4.m13625y("Exception while encrypting input with ", str, " and ", algorithm, " private key (");
                sbM13625y.append(name);
                sbM13625y.append("): ");
                sbM13625y.append(string);
                Log.e("cn_AndroidKeyStore", sbM13625y.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e("cn_AndroidKeyStore", "Cipher " + str + " not supported: " + e2.toString());
            return null;
        }
    }

    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            Log.e("cn_AndroidKeyStore", "Exception while checking support for " + str + ": " + e.toString());
            return false;
        }
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            Log.e("cn_AndroidKeyStore", "Exception while checking support for " + str + ": " + e.toString());
            return false;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                String string = e.toString();
                StringBuilder sbM13625y = zi4.m13625y("Exception while signing message with ", str, " and ", algorithm, " private key (");
                sbM13625y.append(name);
                sbM13625y.append("): ");
                sbM13625y.append(string);
                Log.e("cn_AndroidKeyStore", sbM13625y.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            Log.e("cn_AndroidKeyStore", "Signature algorithm " + str + " not supported: " + e2.toString());
            return null;
        }
    }
}
