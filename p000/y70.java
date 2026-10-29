package p000;

import ads_mobile_sdk.AbstractC0137h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.text.LineBreakConfig;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.EdgeEffect;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y70 {

    /* JADX INFO: renamed from: b */
    public static ClassLoader f34971b;

    /* JADX INFO: renamed from: c */
    public static Thread f34972c;

    /* JADX INFO: renamed from: i */
    public static final pg0 f34978i;

    /* JADX INFO: renamed from: k */
    public static final pg0 f34980k;

    /* JADX INFO: renamed from: n */
    public static final pg0 f34983n;

    /* JADX INFO: renamed from: p */
    public static final pg0 f34985p;

    /* JADX INFO: renamed from: q */
    public static final pg0 f34986q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f34987r = 0;

    /* JADX INFO: renamed from: t */
    public static final z45 f34989t;

    /* JADX INFO: renamed from: a */
    public final x53 f34991a = new x53();

    /* JADX INFO: renamed from: d */
    public static final float[][] f34973d = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: e */
    public static final float[][] f34974e = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: f */
    public static final float[] f34975f = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: g */
    public static final float[][] f34976g = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: h */
    public static final pg0 f34977h = new pg0(1004677957, false, new ah0(3));

    /* JADX INFO: renamed from: j */
    public static final pg0 f34979j = new pg0(-609593746, false, new ah0(4));

    /* JADX INFO: renamed from: l */
    public static final pg0 f34981l = new pg0(-1503538679, false, new ah0(5));

    /* JADX INFO: renamed from: m */
    public static final pg0 f34982m = new pg0(-899812788, false, new ah0(6));

    /* JADX INFO: renamed from: o */
    public static final pg0 f34984o = new pg0(1582997605, false, new xg0(9));

    /* JADX INFO: renamed from: s */
    public static final xd3 f34988s = new xd3("session_id");

    /* JADX INFO: renamed from: u */
    public static final kh5 f34990u = new kh5(11);

    static {
        byte b = 7;
        f34978i = new pg0(-2114493280, false, new xg0(b));
        byte b2 = 8;
        f34980k = new pg0(-245979895, false, new xg0(b2));
        f34983n = new pg0(359472330, false, new ah0(b));
        f34985p = new pg0(-815413697, false, new ah0(b2));
        byte b3 = 10;
        f34986q = new pg0(284101797, false, new xg0(b3));
        f34989t = new z45(b3);
    }

    /* JADX INFO: renamed from: A */
    public static final EnumC0887lw m13000A(int i) {
        if (i == 0) {
            return EnumC0887lw.f24406a;
        }
        if (i == 1) {
            return EnumC0887lw.f24407b;
        }
        C1077qn.m9987m(c75.m3878j("Could not convert ", i, " to BackoffPolicy"));
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static final s03 m13001B(int i) {
        if (i == 0) {
            return s03.f29788a;
        }
        if (i == 1) {
            return s03.f29789b;
        }
        if (i == 2) {
            return s03.f29790c;
        }
        if (i == 3) {
            return s03.f29791d;
        }
        if (i == 4) {
            return s03.f29792e;
        }
        if (i == 5) {
            return s03.f29793f;
        }
        C1077qn.m9987m(c75.m3878j("Could not convert ", i, " to NetworkType"));
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final f63 m13002C(int i) {
        if (i == 0) {
            return f63.f18787a;
        }
        if (i == 1) {
            return f63.f18788b;
        }
        C1077qn.m9987m(c75.m3878j("Could not convert ", i, " to OutOfQuotaPolicy"));
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final f25 m13003D(int i) {
        if (i == 0) {
            return f25.f18681a;
        }
        if (i == 1) {
            return f25.f18682b;
        }
        if (i == 2) {
            return f25.f18683c;
        }
        if (i == 3) {
            return f25.f18684d;
        }
        if (i == 4) {
            return f25.f18685e;
        }
        if (i == 5) {
            return f25.f18686f;
        }
        C1077qn.m9987m(c75.m3878j("Could not convert ", i, " to State"));
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static final void m13004E(g14 g14Var) {
        sc6.m10652X(g14Var).m12254H();
    }

    /* JADX INFO: renamed from: F */
    public static final w01 m13005F(t82 t82Var, boolean z, w82 w82Var) {
        if (t82Var instanceof e92) {
            return ((e92) t82Var).m4987S(z, w82Var);
        }
        return t82Var.mo4978J(w82Var.mo3514n(), z, new C0633f0(1, w82Var, w82.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 22));
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m13006G(ro0 ro0Var) {
        t82 t82Var = (t82) ro0Var.get(o85.f26448h);
        if (t82Var != null) {
            return t82Var.mo4995b();
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m13007H(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m13008I(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m13009J(pk4 pk4Var, boolean z) {
        cf2 cf2VarM11576c;
        uj2 uj2Var = pk4Var.f27696d;
        if (uj2Var == null || (cf2VarM11576c = uj2Var.m11576c()) == null) {
            return false;
        }
        jl3 jl3VarM12845Q = y42.m12845Q(cf2VarM11576c, true);
        jl3 jl3VarM5671i = AbstractC0647fd.m5671i(cf2VarM11576c.mo4008j(jl3VarM12845Q.m7169e()), cf2VarM11576c.mo4008j((((long) Float.floatToRawIntBits(jl3VarM12845Q.f22398c)) << 32) | (((long) Float.floatToRawIntBits(jl3VarM12845Q.f22399d)) & 4294967295L)));
        long jM9548j = pk4Var.m9548j(z);
        float f = jl3VarM5671i.f22396a;
        float f2 = jl3VarM5671i.f22398c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM9548j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = jl3VarM5671i.f22397b;
        float f4 = jl3VarM5671i.f22399d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM9548j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    /* JADX INFO: renamed from: K */
    public static final C1018p1 m13010K(Object[] objArr) {
        C1018p1 c1018p1 = new C1018p1((byte) 1);
        c1018p1.f27270c = objArr;
        VarHandle.storeStoreFence();
        return c1018p1;
    }

    /* JADX INFO: renamed from: L */
    public static final nt2 m13011L(nt2 nt2Var, C1068qe c1068qe, uj2 uj2Var, pk4 pk4Var) {
        dj2 dj2Var = new dj2();
        dj2Var.f17101a = c1068qe;
        dj2Var.f17102b = uj2Var;
        dj2Var.f17103c = pk4Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(dj2Var);
    }

    /* JADX INFO: renamed from: M */
    public static int m13012M(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        wb1.m12191j(zi4.m13618r(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public static float m13013N(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: O */
    public static final Object m13014O(ro0 ro0Var, mq1 mq1Var) throws Throwable {
        eb1 eb1VarM5204a;
        ro0 ro0VarM3820o;
        long jM5051W;
        qo0 qo0Var = gb5.f19711b;
        so0 so0Var = (so0) ro0Var.get(qo0Var);
        r71 r71Var = r71.f29063a;
        if (so0Var == null) {
            eb1VarM5204a = em4.m5204a();
            ro0VarM3820o = c20.m3820o(r71Var, ro0Var.plus(eb1VarM5204a), true);
            pw0 pw0Var = l01.f23664a;
            if (ro0VarM3820o != pw0Var && ro0VarM3820o.get(qo0Var) == null) {
                ro0VarM3820o = ro0VarM3820o.plus(pw0Var);
            }
        } else {
            eb1VarM5204a = (eb1) em4.f18262a.get();
            ro0VarM3820o = c20.m3820o(r71Var, ro0Var, true);
            pw0 pw0Var2 = l01.f23664a;
            if (ro0VarM3820o != pw0Var2 && ro0VarM3820o.get(qo0Var) == null) {
                ro0VarM3820o = ro0VarM3820o.plus(pw0Var2);
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        t00 t00Var = new t00(ro0VarM3820o, true);
        t00Var.f30703e = threadCurrentThread;
        VarHandle.storeStoreFence();
        t00Var.m10957j0(cp0.f16325a, t00Var, mq1Var);
        if (eb1VarM5204a != null) {
            eb1VarM5204a.m5049U(false);
        }
        while (true) {
            if (eb1VarM5204a != null) {
                try {
                    jM5051W = eb1VarM5204a.m5051W();
                } catch (Throwable th) {
                    if (eb1VarM5204a != null) {
                        eb1VarM5204a.m5043O(false);
                    }
                    throw th;
                }
            } else {
                jM5051W = Long.MAX_VALUE;
            }
            if (t00Var.mo4971B()) {
                break;
            }
            LockSupport.parkNanos(t00Var, jM5051W);
            if (Thread.interrupted()) {
                t00Var.m5008x(new InterruptedException());
            }
        }
        if (eb1VarM5204a != null) {
            eb1VarM5204a.m5043O(false);
        }
        Object objM5616a = f92.m5616a(t00Var.m4983O());
        ff0 ff0Var = objM5616a instanceof ff0 ? (ff0) objM5616a : null;
        if (ff0Var == null) {
            return objM5616a;
        }
        throw ff0Var.f18941a;
    }

    /* JADX INFO: renamed from: P */
    public static final long m13015P(jl3 jl3Var) {
        float f = jl3Var.f22398c - jl3Var.f22396a;
        return (((long) Float.floatToRawIntBits(jl3Var.f22399d - jl3Var.f22397b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: Q */
    public static final int m13016Q(f25 f25Var) {
        int iOrdinal = f25Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        C0670g.m5864c();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: R */
    public static final p03 m13017R(byte[] bArr) throws IOException {
        if (bArr.length == 0) {
            return new p03(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                p03 p03VarM11851j = vd6.m11851j(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return p03VarM11851j;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    lb5.m7941v(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                lb5.m7941v(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static final ng3 m13018S(String str) {
        if (str.equals("inapp")) {
            return ng3.InApp;
        }
        if (str.equals("subs")) {
            return ng3.Subs;
        }
        C1077qn.m9987m("Unexpected value ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static float m13019T() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b8 A[Catch: all -> 0x00b4, PHI: r2
  0x00b8: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:62:0x00e7, B:12:0x0023, B:52:0x00b7, B:53:0x00b8, B:65:0x00eb, B:54:0x00b9, B:60:0x00e5, B:59:0x00c3, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040), top: B:77:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: U */
    public static synchronized ClassLoader m13020U() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        classLoader = f34971b;
        if (classLoader == null) {
            Thread thread2 = f34972c;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f34972c.getContextClassLoader();
                    } catch (SecurityException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                classLoader = contextClassLoader;
                f34971b = classLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        C0991op c0991op = new C0991op(threadGroup, "GmsDynamite");
                                        try {
                                            c0991op.setContextClassLoader(null);
                                            c0991op.start();
                                            thread = c0991op;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = c0991op;
                                            String message2 = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f34972c = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f34972c.getContextClassLoader();
                    }
                }
                classLoader = contextClassLoader;
                f34971b = classLoader;
            }
        }
        return classLoader;
    }

    /* JADX INFO: renamed from: a */
    public static v82 m13021a() {
        return new v82(null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m13022b(Object obj, int i, sh2 sh2Var, pg0 pg0Var, mi0 mi0Var, int i2) {
        int i3;
        Object obj2;
        qh2 qh2Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (ir1Var.m6894i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ir1Var.m6886e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ir1Var.m6894i(sh2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ir1Var.m6894i(pg0Var) ? 2048 : 1024;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM6890g = ir1Var.m6890g(obj) | ir1Var.m6890g(sh2Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (zM6890g || objM6869O == i50Var) {
                obj2 = objM6869O;
                qh2 qh2Var2 = new qh2();
                qh2Var2.f28469a = obj;
                qh2Var2.f28470b = sh2Var;
                qh2Var2.f28471c = -1;
                qh2Var2.f28475g = k43.m7398w(null);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(qh2Var2);
                obj2 = qh2Var2;
            }
            qh2 qh2Var3 = (qh2) obj2;
            qh2Var3.f28471c = i;
            d83 d83Var = qh2Var3.f28475g;
            kj0 kj0Var = bb3.f15198a;
            qh2 qh2Var4 = (qh2) ir1Var.m6898k(kj0Var);
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                if (qh2Var4 != ((qh2) d83Var.getValue())) {
                    d83Var.setValue(qh2Var4);
                    if (qh2Var3.f28472d > 0) {
                        qh2 qh2Var5 = qh2Var3.f28473e;
                        if (qh2Var5 != null) {
                            qh2Var5.m9888b();
                        }
                        if (qh2Var4 != null) {
                            qh2Var4.m9887a();
                            qh2Var = qh2Var4;
                        } else {
                            qh2Var = null;
                        }
                        qh2Var3.f28473e = qh2Var;
                    }
                }
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                boolean zM6890g2 = ir1Var.m6890g(qh2Var3);
                Object objM6869O2 = ir1Var.m6869O();
                Object obj3 = objM6869O2;
                if (zM6890g2 || objM6869O2 == i50Var) {
                    b71 b71Var = new b71((byte) 12);
                    b71Var.f15141b = qh2Var3;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(b71Var);
                    obj3 = b71Var;
                }
                lb5.m7923d(qh2Var3, (yp1) obj3, ir1Var);
                as4.m3244c(kj0Var.mo7523a(qh2Var3), pg0Var, ir1Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th;
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rh2 rh2Var = new rh2();
            rh2Var.f29285a = obj;
            rh2Var.f29286b = i;
            rh2Var.f29287c = sh2Var;
            rh2Var.f29288d = pg0Var;
            rh2Var.f29289e = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rh2Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX INFO: renamed from: c */
    public static final void m13023c(boolean z, oo3 oo3Var, pk4 pk4Var, mi0 mi0Var, int i) {
        int i2;
        float fM6435h;
        kl4 kl4VarM11577d;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6892h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6886e(oo3Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(pk4Var) ? 256 : 128;
        }
        byte b = 3;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zM6890g = (i3 == 4) | ir1Var.m6890g(pk4Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (zM6890g || objM6869O == i50Var) {
                mk4 mk4Var = new mk4();
                mk4Var.f24982a = pk4Var;
                mk4Var.f24983b = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(mk4Var);
                obj = mk4Var;
            }
            yj4 yj4Var = (yj4) obj;
            boolean zM6894i = (i3 == 4) | ir1Var.m6894i(pk4Var);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (zM6894i || objM6869O2 == i50Var) {
                qk4 qk4Var = new qk4();
                qk4Var.f28545a = pk4Var;
                qk4Var.f28546b = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(qk4Var);
                obj2 = qk4Var;
            }
            c33 c33Var = (c33) obj2;
            boolean zM9904h = ql4.m9904h(pk4Var.m9550l().f34342b);
            int i4 = (int) (z ? pk4Var.m9550l().f34342b >> 32 : pk4Var.m9550l().f34342b & 4294967295L);
            uj2 uj2Var = pk4Var.f27696d;
            if (uj2Var == null || (kl4VarM11577d = uj2Var.m11577d()) == null) {
                fM6435h = 0.0f;
            } else {
                jl4 jl4Var = kl4VarM11577d.f23216a;
                if (i4 >= 0) {
                    il4 il4Var = jl4Var.f22400a;
                    yu2 yu2Var = jl4Var.f22401b;
                    if (il4Var.f21533a.f24092b.length() == 0) {
                        fM6435h = 0.0f;
                    } else {
                        int iMin = Math.min(yu2Var.m13245d(i4), Math.min(yu2Var.f35533b - 1, yu2Var.f35537f - 1));
                        if (i4 > yu2Var.m13244c(iMin, false)) {
                            fM6435h = 0.0f;
                        } else {
                            yu2Var.m13252l(iMin);
                            ArrayList arrayList = yu2Var.f35539h;
                            n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, iMin));
                            fM6435h = n73Var.f25497a.f34185c.m6435h(iMin - n73Var.f25500d);
                        }
                    }
                } else {
                    fM6435h = 0.0f;
                }
            }
            boolean zM6894i2 = ir1Var.m6894i(yj4Var);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj3 = objM6869O3;
            if (zM6894i2 || objM6869O3 == i50Var) {
                C1252vd c1252vd = new C1252vd((byte) 7);
                c1252vd.f32529b = yj4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1252vd);
                obj3 = c1252vd;
            }
            i20.m6581f(c33Var, z, oo3Var, zM9904h, 0L, fM6435h, rf4.m10327a(kt2.f23428a, yj4Var, (PointerInputEventHandler) obj3), ir1Var, (i2 << 3) & 1008);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ga1 ga1Var = new ga1(b);
            ga1Var.f19685b = z;
            ga1Var.f19686c = oo3Var;
            ga1Var.f19688e = pk4Var;
            ga1Var.f19687d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ga1Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m13024d(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    /* JADX INFO: renamed from: e */
    public static int m13025e(Context context, int i) {
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (i == resources.getConfiguration().orientation || i == 0) ? qq2.m10010E(displayMetrics.heightPixels / displayMetrics.density) : qq2.m10010E(displayMetrics.widthPixels / displayMetrics.density);
    }

    /* JADX INFO: renamed from: f */
    public static C0516c6 m13026f(Context context, int i, int i2) {
        int iM10010E;
        int iMin = Math.min(90, qq2.m10009D(((double) m13025e(context, i2)) * 0.15d));
        if (i > 655) {
            iM10010E = qq2.m10010E((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            iM10010E = 81;
        } else if (i > 526) {
            iM10010E = qq2.m10010E((i / 468.0f) * 60.0f);
        } else {
            iM10010E = i > 432 ? 68 : qq2.m10010E((i / 320.0f) * 50.0f);
        }
        return new C0516c6(i, Math.max(Math.min(iM10010E, iMin), 50), 52, null);
    }

    /* JADX INFO: renamed from: g */
    public static void m13027g(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: h */
    public static float m13028h(EdgeEffect edgeEffect, float f, float f2, ky0 ky0Var) {
        float distance;
        float f3 = q61.f28238a;
        double dMo3580c = ky0Var.mo3580c() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) q61.f28238a) * dMo3580c;
        float fExp = (float) (Math.exp((q61.f28239b / q61.f28240c) * Math.log(dAbs / d)) * d);
        try {
            distance = edgeEffect.getDistance();
        } catch (Throwable unused) {
            distance = 0.0f;
        }
        if (fExp > distance * f2) {
            return 0.0f;
        }
        edgeEffect.onAbsorb(qq2.m10010E(f));
        return f;
    }

    /* JADX INFO: renamed from: i */
    public static C0516c6 m13029i(Context context, int i, int i2) {
        return new C0516c6(i, Math.max(Math.min(Math.max(100, qq2.m10010E((i / 320.0f) * 100.0f)), Math.min(150, qq2.m10009D(((double) m13025e(context, i2)) * 0.2d))), 50), 28, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m13030j(Object obj) {
        if (obj != null) {
            return;
        }
        xy4.m12782k("Cannot return null from a non- @Provides method");
    }

    /* JADX INFO: renamed from: k */
    public static final LinkedHashSet m13031k(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        il0 il0Var = new il0();
                        il0Var.f21526a = uri;
                        il0Var.f21527b = z;
                        VarHandle.storeStoreFence();
                        linkedHashSet.add(il0Var);
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        lb5.m7941v(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                lb5.m7941v(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m13032l(ro0 ro0Var, CancellationException cancellationException) {
        t82 t82Var = (t82) ro0Var.get(o85.f26448h);
        if (t82Var != null) {
            t82Var.mo4993a(cancellationException);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Object m13033m(t82 t82Var, ym0 ym0Var) {
        t82Var.mo4993a(null);
        Object objMo5005t = t82Var.mo5005t(ym0Var);
        return objMo5005t == ap0.f14763a ? objMo5005t : ju4.f22634a;
    }

    /* JADX INFO: renamed from: n */
    public static void m13034n(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: o */
    public static void m13035o(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: p */
    public static final float m13036p(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX INFO: renamed from: q */
    public static final C1253ve m13037q(si1 si1Var, int i) {
        b80.f15152Yo.getClass();
        int i2 = a80.f161b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (si1Var instanceof d80) {
            d80 d80Var = (d80) si1Var;
            y30 y30Var = d80Var.f16850c;
            si1 si1VarMo3888g = d80Var.mo3888g();
            if (si1VarMo3888g != null) {
                int i4 = d80Var.f16849b;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (y30Var == y30.f34832a) {
                    if (i4 == 0) {
                        i3 = 0;
                    }
                } else if (i == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                return new C1253ve(i3, y30Var, d80Var.f16848a, si1VarMo3888g);
            }
        }
        return new C1253ve(i3, y30.f34832a, r71.f29063a, si1Var);
    }

    /* JADX INFO: renamed from: r */
    public static StaticLayout m13038r(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            r32.m10186a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            r32.m10186a("invalid end value");
        }
        if (i3 < 0) {
            r32.m10186a("invalid maxLines value");
        }
        if (i < 0) {
            r32.m10186a("invalid width value");
        }
        if (i4 < 0) {
            r32.m10186a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        if (Build.VERSION.SDK_INT >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: s */
    public static final jl3 m13039s(mt2 mt2Var, boolean z, boolean z2) {
        if (!mt2Var.f25195a.f25208n) {
            return jl3.f22395e;
        }
        if (z) {
            return sc6.m10650V(mt2Var, 8).m4893w1();
        }
        e13 e13VarM10650V = sc6.m10650V(mt2Var, 8);
        return y42.m12861j0(e13VarM10650V).mo4003Q(e13VarM10650V, z2);
    }

    /* JADX INFO: renamed from: t */
    public static final void m13040t(ro0 ro0Var) {
        t82 t82Var = (t82) ro0Var.get(o85.f26448h);
        if (t82Var != null && !t82Var.mo4995b()) {
            throw t82Var.mo5006u();
        }
    }

    /* JADX INFO: renamed from: v */
    public static C0516c6 m13041v(int i, int i2) {
        if (i2 < 50) {
            AbstractC0137h.m1115c("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 50 dp.", null);
        }
        if (i2 >= 1) {
            return new C0516c6(i, i2, 44, null);
        }
        C1077qn.m9988n(c75.m3877i(i2, "Invalid maxHeight for inline adaptive banner: "));
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final t82 m13042w(ro0 ro0Var) {
        t82 t82Var = (t82) ro0Var.get(o85.f26448h);
        if (t82Var != null) {
            return t82Var;
        }
        nm0.m8798k(ro0Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final nr3 m13043x(sq2 sq2Var) {
        Object objMo4423m = sq2Var.mo4423m();
        if (objMo4423m instanceof nr3) {
            return (nr3) objMo4423m;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final float m13044y(nr3 nr3Var) {
        if (nr3Var != null) {
            return nr3Var.f26055a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: z */
    public static int m13045z(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f34975f;
        return gd0.m5971a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: u */
    public final void m13046u(InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        this.f34991a.m12492V(interfaceC0618en, p84Var, om3Var, w53Var);
    }
}
