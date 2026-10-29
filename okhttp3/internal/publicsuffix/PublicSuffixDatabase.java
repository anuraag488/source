package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.invoke.VarHandle;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C1077qn;
import p000.a24;
import p000.ak3;
import p000.c24;
import p000.c75;
import p000.g41;
import p000.h41;
import p000.hb0;
import p000.hb3;
import p000.hd4;
import p000.kx5;
import p000.lb5;
import p000.n40;
import p000.nb0;
import p000.su1;
import p000.v71;
import p000.z62;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final byte[] f26831e = {42};

    /* JADX INFO: renamed from: f */
    public static final List f26832f = Collections.singletonList("*");

    /* JADX INFO: renamed from: g */
    public static final PublicSuffixDatabase f26833g;

    /* JADX INFO: renamed from: a */
    public AtomicBoolean f26834a;

    /* JADX INFO: renamed from: b */
    public CountDownLatch f26835b;

    /* JADX INFO: renamed from: c */
    public byte[] f26836c;

    /* JADX INFO: renamed from: d */
    public byte[] f26837d;

    static {
        PublicSuffixDatabase publicSuffixDatabase = new PublicSuffixDatabase();
        publicSuffixDatabase.f26834a = new AtomicBoolean(false);
        publicSuffixDatabase.f26835b = new CountDownLatch(1);
        VarHandle.storeStoreFence();
        f26833g = publicSuffixDatabase;
    }

    /* JADX INFO: renamed from: c */
    public static List m9165c(String str) {
        List listM6354t0 = hd4.m6354t0(str, new char[]{'.'});
        return z62.m13387o(hb0.m6306R0(listM6354t0), "") ? hb0.m6296H0(listM6354t0) : listM6354t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final String m9166a(String str) {
        String strM7736u;
        String strM7736u2;
        String strM7736u3;
        List listM6354t0;
        int size;
        int size2;
        List listM9165c = m9165c(IDN.toUnicode(str));
        List listM6354t1 = v71.f32439a;
        if (this.f26834a.get() || !this.f26834a.compareAndSet(false, true)) {
            try {
                this.f26835b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        m9167b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        hb3 hb3Var = hb3.f20468a;
                        hb3.f20468a.getClass();
                        hb3.m6326f(5, "Failed to read public suffix list", e);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f26836c == null) {
            C1077qn.m9989o("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = listM9165c.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            bArr[i] = ((String) listM9165c.get(i)).getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strM7736u = null;
                break;
            }
            byte[] bArr2 = this.f26836c;
            if (bArr2 == null) {
                z62.m13366Y("publicSuffixListBytes");
                throw null;
            }
            strM7736u = kx5.m7736u(bArr2, bArr, i2);
            if (strM7736u != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strM7736u2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strM7736u2 = null;
                break;
            }
            bArr3[i3] = f26831e;
            byte[] bArr4 = this.f26836c;
            if (bArr4 == null) {
                z62.m13366Y("publicSuffixListBytes");
                throw null;
            }
            strM7736u2 = kx5.m7736u(bArr4, bArr3, i3);
            if (strM7736u2 != null) {
                break;
            }
            i3++;
        }
        if (strM7736u2 == null) {
            strM7736u3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strM7736u3 = null;
                break;
            }
            byte[] bArr5 = this.f26837d;
            if (bArr5 == null) {
                z62.m13366Y("publicSuffixExceptionListBytes");
                throw null;
            }
            strM7736u3 = kx5.m7736u(bArr5, bArr, i5);
            if (strM7736u3 != null) {
                break;
            }
            i5++;
        }
        if (strM7736u3 != null) {
            listM6354t0 = hd4.m6354t0("!".concat(strM7736u3), new char[]{'.'});
        } else if (strM7736u == null && strM7736u2 == null) {
            listM6354t0 = f26832f;
        } else {
            List listM6354t2 = strM7736u != null ? hd4.m6354t0(strM7736u, new char[]{'.'}) : listM6354t1;
            if (strM7736u2 != null) {
                listM6354t1 = hd4.m6354t0(strM7736u2, new char[]{'.'});
            }
            listM6354t0 = listM6354t2.size() > listM6354t1.size() ? listM6354t2 : listM6354t1;
        }
        if (listM9165c.size() == listM6354t0.size() && ((String) listM6354t0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM6354t0.get(0)).charAt(0) == '!') {
            size = listM9165c.size();
            size2 = listM6354t0.size();
        } else {
            size = listM9165c.size();
            size2 = listM6354t0.size() + 1;
        }
        int i6 = size - size2;
        List listM9165c2 = m9165c(str);
        nb0 nb0Var = new nb0((byte) 0);
        nb0Var.f25616b = listM9165c2;
        VarHandle.storeStoreFence();
        a24 a24VarMo127a = nb0Var;
        if (i6 < 0) {
            C1077qn.m9988n(c75.m3878j("Requested element count ", i6, " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            a24VarMo127a = nb0Var instanceof h41 ? ((h41) nb0Var).mo127a(i6) : new g41(nb0Var, i6);
        }
        return c24.m3832O(a24VarMo127a, ".");
    }

    /* JADX INFO: renamed from: b */
    public final void m9167b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                ak3 ak3Var = new ak3(new su1(n40.m8490A(resourceAsStream)));
                try {
                    long jM3029j = ak3Var.m3029j();
                    ak3Var.m3034q(jM3029j);
                    byte[] bArrM12068t = ak3Var.f14586b.m12068t(jM3029j);
                    long jM3029j2 = ak3Var.m3029j();
                    ak3Var.m3034q(jM3029j2);
                    byte[] bArrM12068t2 = ak3Var.f14586b.m12068t(jM3029j2);
                    ak3Var.close();
                    synchronized (this) {
                        this.f26836c = bArrM12068t;
                        this.f26837d = bArrM12068t2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        lb5.m7941v(ak3Var, th);
                        throw th2;
                    }
                }
            }
            this.f26835b.countDown();
        } catch (Throwable th3) {
            this.f26835b.countDown();
            throw th3;
        }
    }
}
