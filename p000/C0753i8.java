package p000;

import ads_mobile_sdk.by3;
import ads_mobile_sdk.cy3;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0753i8 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21161a;

    public /* synthetic */ C0753i8(byte b) {
        this.f21161a = b;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:68:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f21161a) {
            case 0:
                try {
                    return (Cipher) n81.f25513b.f25518a.mo3139g("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) n81.f25513b.f25518a.mo3139g("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    return (Cipher) n81.f25513b.f25518a.mo3139g("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 3:
                try {
                    Cipher cipher = (Cipher) n81.f25513b.f25518a.mo3139g("AES/GCM-SIV/NoPadding");
                    if (C0864l9.m7873a(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            case 4:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C0946nh c0946nh = new C0946nh(choreographer, Handler.createAsync(looperMyLooper));
                    return qs5.m10089N(c0946nh, c0946nh.f25798k);
                }
                C1077qn.m9989o("no Looper on this thread");
                return null;
            case 5:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(zv4.f36419e);
                return simpleDateFormat;
            case 6:
                return new Random();
            case 7:
                try {
                    return (Cipher) n81.f25513b.f25518a.mo3139g("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 8:
                Provider providerM13360S = z62.m13360S();
                if (providerM13360S == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerM13360S);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
            case 9:
                WeakHashMap weakHashMap = cy3.f2323a;
                by3 by3Var = new by3(SystemClock.currentThreadTimeMillis());
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap2 = cy3.f2323a;
                synchronized (weakHashMap2) {
                }
                return by3Var;
            default:
                return 0L;
        }
    }
}
