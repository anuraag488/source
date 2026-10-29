package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import java.lang.invoke.VarHandle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class s36 {

    /* JADX INFO: renamed from: a */
    public static final C0641f8 f29861a;

    static {
        C0641f8 c0641f8 = new C0641f8((byte) 9);
        c0641f8.f18827b = d55.m4367l("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PhoneskyVerificationUtils");
        VarHandle.storeStoreFence();
        f29861a = c0641f8;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10518a(Context context) {
        C0641f8 c0641f8 = f29861a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                c0641f8.m5613a("Play Store package is disabled.");
                return false;
            }
            try {
                return m10519b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures);
            } catch (PackageManager.NameNotFoundException unused) {
                c0641f8.m5613a("Play Store package is not found.");
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            c0641f8.m5613a("Play Store package is not found.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10519b(Signature[] signatureArr) {
        String strEncodeToString;
        C0641f8 c0641f8 = f29861a;
        if (signatureArr == null || (signatureArr.length) == 0) {
            c0641f8.m5613a("Play Store package is not signed -- possibly self-built package. Could not verify.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused) {
                strEncodeToString = "";
            }
            arrayList.add(strEncodeToString);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        c0641f8.m5613a("Play Store package certs are not valid. Found these sha256 certs: [" + sb.toString() + "].");
        return false;
    }
}
