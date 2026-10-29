package p000;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pq5 {

    /* JADX INFO: renamed from: a */
    public static final String f27899a = cq5.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public static final MessageDigest f27900b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            String str = f27899a;
            if (Log.isLoggable(str, 3)) {
                rw5.m10480b(str, "Error while instantiating messageDigest", e);
            }
            messageDigest = null;
        }
        f27900b = messageDigest;
    }
}
