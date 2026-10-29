package p000;

import android.util.Log;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class if1 {

    /* JADX INFO: renamed from: a */
    public Object f21324a;

    /* JADX INFO: renamed from: b */
    public Object f21325b;

    /* JADX INFO: renamed from: c */
    public Object f21326c;

    /* JADX INFO: renamed from: d */
    public Object f21327d;

    /* JADX INFO: renamed from: e */
    public Object f21328e;

    /* JADX INFO: renamed from: f */
    public Object f21329f;

    /* JADX INFO: renamed from: g */
    public Object f21330g;

    public if1(String str, if1 if1Var, jp0 jp0Var) {
        this.f21327d = new C1126rz(this, false);
        this.f21328e = new C1126rz(this, true);
        oq3 oq3Var = new oq3();
        oq3Var.f26963a = new ArrayList();
        oq3Var.f26964b = (short) 128;
        VarHandle.storeStoreFence();
        this.f21329f = oq3Var;
        this.f21330g = new AtomicMarkableReference(null, false);
        this.f21324a = str;
        this.f21325b = new us2(if1Var);
        this.f21326c = jp0Var;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m6783d(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6784e(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m6784e(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: f */
    public static List m6785f(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX INFO: renamed from: a */
    public vs3 m6786a() throws GeneralSecurityException {
        w42 w42Var;
        w42 w42Var2;
        zs3 zs3Var = (zs3) this.f21324a;
        if (zs3Var == null) {
            xy4.m12788q("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        w42 w42Var3 = (w42) this.f21326c;
        if (w42Var3 == null || (w42Var = (w42) this.f21327d) == null) {
            xy4.m12788q("Cannot build without prime factors");
            return null;
        }
        w42 w42Var4 = (w42) this.f21325b;
        if (w42Var4 == null) {
            xy4.m12788q("Cannot build without private exponent");
            return null;
        }
        w42 w42Var5 = (w42) this.f21328e;
        if (w42Var5 == null || (w42Var2 = (w42) this.f21329f) == null) {
            xy4.m12788q("Cannot build without prime exponents");
            return null;
        }
        w42 w42Var6 = (w42) this.f21330g;
        if (w42Var6 == null) {
            xy4.m12788q("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = zs3Var.f36342u.f29583b;
        BigInteger bigInteger2 = zs3Var.f36343v;
        BigInteger bigInteger3 = (BigInteger) w42Var3.f33090b;
        BigInteger bigInteger4 = (BigInteger) w42Var.f33090b;
        BigInteger bigInteger5 = (BigInteger) w42Var4.f33090b;
        BigInteger bigInteger6 = (BigInteger) w42Var5.f33090b;
        BigInteger bigInteger7 = (BigInteger) w42Var2.f33090b;
        BigInteger bigInteger8 = (BigInteger) w42Var6.f33090b;
        if (!bigInteger3.isProbablePrime(10)) {
            xy4.m12788q("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            xy4.m12788q("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            xy4.m12788q("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            xy4.m12788q("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            xy4.m12788q("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            xy4.m12788q("dQ is invalid.");
            return null;
        }
        if (!bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            xy4.m12788q("qInv is invalid.");
            return null;
        }
        zs3 zs3Var2 = (zs3) this.f21324a;
        w42 w42Var7 = (w42) this.f21326c;
        w42 w42Var8 = (w42) this.f21327d;
        w42 w42Var9 = (w42) this.f21325b;
        w42 w42Var10 = (w42) this.f21328e;
        w42 w42Var11 = (w42) this.f21329f;
        w42 w42Var12 = (w42) this.f21330g;
        vs3 vs3Var = new vs3();
        vs3Var.f32834u = zs3Var2;
        vs3Var.f32836w = w42Var7;
        vs3Var.f32837x = w42Var8;
        vs3Var.f32835v = w42Var9;
        vs3Var.f32838y = w42Var10;
        vs3Var.f32839z = w42Var11;
        vs3Var.f32833A = w42Var12;
        VarHandle.storeStoreFence();
        return vs3Var;
    }

    /* JADX INFO: renamed from: b */
    public void m6787b(String str) {
        File file = new File((File) this.f21325b, str);
        if (file.exists() && m6784e(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public File m6788c(String str, String str2) {
        File file = new File((File) this.f21327d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    /* JADX INFO: renamed from: g */
    public void m6789g(String str) {
        C1126rz c1126rz = (C1126rz) this.f21328e;
        synchronized (c1126rz) {
            try {
                if (((sd2) ((AtomicMarkableReference) c1126rz.f29738b).getReference()).m10687b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c1126rz.f29738b;
                    atomicMarkableReference.set((sd2) atomicMarkableReference.getReference(), true);
                    RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 15);
                    runnableC1054q0.f28115b = c1126rz;
                    VarHandle.storeStoreFence();
                    if (((AtomicReference) c1126rz.f29739c).compareAndSet(null, runnableC1054q0)) {
                        ((yq0) ((jp0) ((if1) c1126rz.f29740d).f21326c).f22482c).m13214a(runnableC1054q0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public if1() {
        this.f21324a = new AtomicBoolean();
        this.f21325b = null;
        this.f21326c = new HashMap(16, 1.0f);
        this.f21327d = new HashMap(16, 1.0f);
        this.f21328e = new HashMap(16, 1.0f);
        this.f21329f = new HashMap(16, 1.0f);
        this.f21330g = null;
    }
}
