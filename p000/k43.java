package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0321s2;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.su1;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k43 {

    /* JADX INFO: renamed from: A */
    public static g12 f22861A = null;

    /* JADX INFO: renamed from: B */
    public static long f22862B = -1;

    /* JADX INFO: renamed from: C */
    public static long f22863C = -1;

    /* JADX INFO: renamed from: D */
    public static volatile int f22864D = 1;

    /* JADX INFO: renamed from: b */
    public static final pg0 f22865b = new pg0(-95103669, false, new tg0(15));

    /* JADX INFO: renamed from: d */
    public static final pg0 f22866d = new pg0(1134896640, false, new fh0(29));

    /* JADX INFO: renamed from: j */
    public static final pg0 f22867j = new pg0(1834271122, false, new tg0(19));

    /* JADX INFO: renamed from: k */
    public static final pg0 f22868k = new pg0(417761431, false, new xg0(0));

    /* JADX INFO: renamed from: l */
    public static final pg0 f22869l = new pg0(-1486662284, false, new tg0(20));

    /* JADX INFO: renamed from: o */
    public static final pg0 f22870o = new pg0(-1497823549, false, new xg0(1));

    /* JADX INFO: renamed from: p */
    public static final pg0 f22871p = new pg0(-1057074091, false, new tg0(21));

    /* JADX INFO: renamed from: q */
    public static final pg0 f22872q = new pg0(1519775834, false, new xg0(2));

    /* JADX INFO: renamed from: r */
    public static final pg0 f22873r = new pg0(1305206706, false, new tg0(16));

    /* JADX INFO: renamed from: s */
    public static final pg0 f22874s = new pg0(1026152140, false, new fh0(28));

    /* JADX INFO: renamed from: t */
    public static final pg0 f22875t = new pg0(1701121118, false, new tg0(17));

    /* JADX INFO: renamed from: u */
    public static final pg0 f22876u = new pg0(-717363360, false, new tg0(18));

    /* JADX INFO: renamed from: v */
    public static final ExecutorC0952nn f22877v = new ExecutorC0952nn((byte) 1);

    /* JADX INFO: renamed from: w */
    public static final C1254vf f22878w = new C1254vf(6);

    /* JADX INFO: renamed from: x */
    public static final ix1 f22879x = new ix1(2);

    /* JADX INFO: renamed from: y */
    public static final z45 f22880y = new z45(3);

    /* JADX INFO: renamed from: z */
    public static final kh5 f22881z = new kh5(5);

    /* JADX INFO: renamed from: A */
    public static nr6 m7367A(nr6 nr6Var, nr6 nr6Var2) {
        js1 js1Var = new js1();
        rr5 rr5Var = new rr5((byte) 0);
        rr5Var.f29555b = new nr6();
        VarHandle.storeStoreFence();
        js1Var.f22555a = rr5Var;
        VarHandle.storeStoreFence();
        li4 li4Var = new li4();
        li4Var.f24059a = new nr6();
        bt5 bt5Var = new bt5((byte) 17);
        bt5Var.f15596b = li4Var;
        VarHandle.storeStoreFence();
        wd3 wd3Var = new wd3((byte) 26);
        wd3Var.f33259b = bt5Var;
        VarHandle.storeStoreFence();
        ((nr6) rr5Var.f29555b).m8820d(mi4.f24958a, wd3Var);
        VarHandle.storeStoreFence();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ck0 ck0Var = new ck0((byte) 1);
        ck0Var.f16074b = li4Var;
        ck0Var.f16075c = atomicBoolean;
        ck0Var.f16076d = js1Var;
        VarHandle.storeStoreFence();
        Executor executor = f22877v;
        nr6Var.m8822f(executor, ck0Var);
        nr6Var2.m8822f(executor, ck0Var);
        return li4Var.f24059a;
    }

    /* JADX INFO: renamed from: B */
    public static final mq1 m7368B(boolean z, wp1 wp1Var, ir1 ir1Var) {
        C0950nl c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
        yp1 yp1VarM5365o0 = ev0.m5365o0(ir1Var);
        mq1 mq1VarM10008C = qq2.m10008C(ir1Var);
        yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
        dz0 dz0VarM10705T = se0.m10705T(ir1Var);
        xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            a62 a62Var = new a62(dz0VarM10705T, yp1VarM5365o0, mq1VarM10008C, wp1Var, yp1VarM5366p0, xz4Var, z, c0950nl, null);
            ir1Var.m6905n0(a62Var);
            objM6869O = a62Var;
        }
        return (mq1) objM6869O;
    }

    /* JADX INFO: renamed from: C */
    public static final sw2 m7369C(Object obj, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            objM6869O = m7398w(obj);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        sw2Var.setValue(obj);
        return sw2Var;
    }

    /* JADX INFO: renamed from: D */
    public static final long m7370D(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: E */
    public static int m7371E(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: F */
    public static int m7372F(Object obj) {
        return m7371E(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: G */
    public static final zi0 m7373G(ui0 ui0Var, pg0 pg0Var) {
        zi0 zi0Var = new zi0(ui0Var, ku4.f23525h);
        zi0Var.m13573B(pg0Var);
        return zi0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static C0726hi m7374H(int i, String str) {
        C0726hi c0726hi = new C0726hi();
        c0726hi.f20591a = i;
        c0726hi.f20592b = str;
        c0726hi.f20593c = m7398w(g42.f19605e);
        c0726hi.f20594d = m7398w(Boolean.TRUE);
        VarHandle.storeStoreFence();
        return c0726hi;
    }

    /* JADX INFO: renamed from: I */
    public static final void m7375I(bj4 bj4Var, Object obj, TextClassification textClassification, int i, Drawable drawable) {
        qj4 qj4Var = new qj4(obj);
        qj4Var.f28530b = textClassification;
        qj4Var.f28531c = i;
        qj4Var.f28532d = drawable;
        VarHandle.storeStoreFence();
        bj4Var.f15334a.m4200a(qj4Var);
    }

    /* JADX INFO: renamed from: J */
    public static final void m7376J(Object obj) {
        if (obj instanceof cp3) {
            throw ((cp3) obj).f16333a;
        }
    }

    /* JADX INFO: renamed from: K */
    public static Bitmap m7377K(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            C1077qn.m9987m("bitmap is null");
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i, i2, i3, i4);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: L */
    public static Class m7378L(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX INFO: renamed from: a */
    public static C0457ak m7379a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C0457ak(sw4.f30612a, Float.valueOf(f), new C0494bk(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public static final void m7380b(long j, xl4 xl4Var, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1332136871);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6888f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(xl4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            kj0 kj0Var = gl4.f19869a;
            as4.m3245d(new zh3[]{zl0.f36166a.mo7523a(pb0.m9462a(j)), kj0Var.mo7523a(((xl4) ir1Var.m6898k(kj0Var)).m12712d(xl4Var))}, mq1Var, ir1Var, (i2 >> 3) & 112);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            k02 k02Var = new k02(b);
            k02Var.f22791b = j;
            k02Var.f22793d = xl4Var;
            k02Var.f22794e = mq1Var;
            k02Var.f22792c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = k02Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0516c6 m7381c(C0516c6 c0516c6, C0213l2 c0213l2, ey0 ey0Var) {
        C0321s2 c0321s2;
        return (((Boolean) ey0Var.m13553a("gads:use_ad_config_ad_size_for_banner_mediation:enabled", Boolean.TRUE, C0033as.a$19)).booleanValue() && (c0516c6 == null || !c0516c6.f15825d) && (c0321s2 = (C0321s2) hb0.m6301M0(c0213l2.f6622g)) != null) ? new C0516c6(c0321s2.f10995a, c0321s2.f10996b) : c0516c6;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m7382d(AbstractC1384yx abstractC1384yx, as2 as2Var) {
        Bundle bundle = (Bundle) abstractC1384yx.f35579g.get(as2Var.getClass().getName());
        return bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m7383e(wa2 wa2Var) {
        Bundle bundle = new Bundle();
        Iterator it = ((nl2) wa2Var.f33192a.keySet()).iterator();
        while (((ml2) it).hasNext()) {
            String str = (String) ((ml2) it).m8344a().f26847f;
            try {
                su1 su1Var = su1.f11748a;
                bundle.putString(str, wa2Var.m12186z(str).mo3532s());
            } catch (IllegalStateException unused) {
            }
        }
        bundle.remove("max_ad_content_rating");
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public static void m7384f(wa2 wa2Var, go3 go3Var) {
        if (wa2Var.f33192a.containsKey("max_ad_content_rating")) {
            su1 su1Var = su1.f11748a;
            wa2Var.m12186z("max_ad_content_rating").mo3532s();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7385g(qx2 qx2Var) {
        int i = xa5.f34118c[qx2Var.mo8885b().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            C0670g.m5864c();
            return;
        }
        int i2 = xa5.f34117b[qx2Var.mo8895l().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            C0670g.m5864c();
            return;
        }
        lx2 lx2VarMo8889f = qx2Var.mo8889f();
        if (lx2VarMo8889f == null) {
            return;
        }
        int i3 = xa5.f34116a[lx2VarMo8889f.ordinal()];
    }

    /* JADX INFO: renamed from: h */
    public static nt2 m7386h(nt2 nt2Var) {
        C1115ro c1115ro = new C1115ro();
        c1115ro.f29469a = 1.0f;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(c1115ro);
    }

    /* JADX INFO: renamed from: l */
    public static nt2 m7387l(nt2 nt2Var) {
        C0499bp c0499bp = new C0499bp((byte) 9);
        j90 j90Var = new j90();
        j90Var.f22108a = c0499bp;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(j90Var);
    }

    /* JADX INFO: renamed from: m */
    public static C0457ak m7388m(C0457ak c0457ak, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) c0457ak.f14572b.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C0494bk) c0457ak.f14573c).f15339a;
        }
        return new C0457ak(c0457ak.f14571a, Float.valueOf(f), new C0494bk(f2), c0457ak.f14574d, c0457ak.f14575e, c0457ak.f14576f);
    }

    /* JADX INFO: renamed from: n */
    public static final cp3 m7389n(Throwable th) {
        cp3 cp3Var = new cp3();
        cp3Var.f16333a = th;
        VarHandle.storeStoreFence();
        return cp3Var;
    }

    /* JADX INFO: renamed from: o */
    public static y05 m7390o(mi0 mi0Var) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
        y05 y05VarM7393r = m7393r(view);
        boolean zM6894i = ir1Var.m6894i(y05VarM7393r) | ir1Var.m6894i(view);
        Object objM6869O = ir1Var.m6869O();
        if (zM6894i || objM6869O == ki0.f23136a) {
            obj = objM6869O;
            cz3 cz3Var = new cz3((byte) 23);
            cz3Var.f16638b = y05VarM7393r;
            cz3Var.f16639c = view;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(cz3Var);
            obj = cz3Var;
        }
        obj = objM6869O;
        lb5.m7923d(y05VarM7393r, (yp1) obj, ir1Var);
        return y05VarM7393r;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7391p(ti1 ti1Var, b80 b80Var, boolean z, wm0 wm0Var) throws Throwable {
        vi1 vi1Var;
        z30 it;
        z30 z30Var;
        ti1 ti1Var2;
        Object objM13297b;
        if (wm0Var instanceof vi1) {
            vi1Var = (vi1) wm0Var;
            int i = vi1Var.f32643y;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi1Var.f32643y = i - Integer.MIN_VALUE;
            } else {
                vi1Var = new vi1(wm0Var);
            }
        } else {
            vi1Var = new vi1(wm0Var);
        }
        Object obj = vi1Var.f32642x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = vi1Var.f32643y;
        try {
            if (i2 == 0) {
                m7376J(obj);
                if (ti1Var instanceof om4) {
                    throw ((om4) ti1Var).f26891a;
                }
                it = b80Var.iterator();
                vi1Var.f32638t = ti1Var;
                vi1Var.f32639u = b80Var;
                vi1Var.f32640v = it;
                vi1Var.f32641w = z;
                vi1Var.f32643y = 1;
                objM13297b = it.m13297b(vi1Var);
                if (objM13297b == ap0Var) {
                    ti1Var2 = ti1Var;
                    z30Var = it;
                    obj = objM13297b;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z) {
                            b80Var.mo3508a(null);
                        }
                        return ju4.f22634a;
                    }
                    Object objM13298c = z30Var.m13298c();
                    vi1Var.f32638t = ti1Var2;
                    vi1Var.f32639u = b80Var;
                    vi1Var.f32640v = z30Var;
                    vi1Var.f32641w = z;
                    vi1Var.f32643y = 2;
                }
                return ap0Var;
            }
            if (i2 == 1) {
                z = vi1Var.f32641w;
                z30Var = vi1Var.f32640v;
                b80Var = vi1Var.f32639u;
                ti1Var2 = vi1Var.f32638t;
                m7376J(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        b80Var.mo3508a(null);
                    }
                    return ju4.f22634a;
                }
                Object objM13298c2 = z30Var.m13298c();
                vi1Var.f32638t = ti1Var2;
                vi1Var.f32639u = b80Var;
                vi1Var.f32640v = z30Var;
                vi1Var.f32641w = z;
                vi1Var.f32643y = 2;
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = vi1Var.f32641w;
                z30Var = vi1Var.f32640v;
                b80Var = vi1Var.f32639u;
                ti1Var2 = vi1Var.f32638t;
                m7376J(obj);
            }
            it = z30Var;
            ti1Var = ti1Var2;
            vi1Var.f32638t = ti1Var;
            vi1Var.f32639u = b80Var;
            vi1Var.f32640v = it;
            vi1Var.f32641w = z;
            vi1Var.f32643y = 1;
            objM13297b = it.m13297b(vi1Var);
            if (objM13297b == ap0Var) {
                ti1Var2 = ti1Var;
                z30Var = it;
                obj = objM13297b;
                if (!((Boolean) obj).booleanValue()) {
                    if (z) {
                        b80Var.mo3508a(null);
                    }
                    return ju4.f22634a;
                }
                Object objM13298c3 = z30Var.m13298c();
                vi1Var.f32638t = ti1Var2;
                vi1Var.f32639u = b80Var;
                vi1Var.f32640v = z30Var;
                vi1Var.f32641w = z;
                vi1Var.f32643y = 2;
            }
            return ap0Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    b80Var.mo3508a(cancellationException);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final long m7392q(long j, boolean z, int i, float f) {
        int iM7539i = ((z || i == 2 || i == 4 || i == 5) && kl0.m7535e(j)) ? kl0.m7539i(j) : Integer.MAX_VALUE;
        if (kl0.m7541k(j) != iM7539i) {
            iM7539i = sc6.m10675p(as4.m3261t(f), kl0.m7541k(j), iM7539i);
        }
        return C0638f5.m5548s(0, iM7539i, 0, kl0.m7538h(j));
    }

    /* JADX INFO: renamed from: r */
    public static y05 m7393r(View view) {
        y05 y05Var;
        WeakHashMap weakHashMap = y05.f34773x;
        synchronized (weakHashMap) {
            try {
                Object y05Var2 = weakHashMap.get(view);
                if (y05Var2 == null) {
                    y05Var2 = new y05(view);
                    weakHashMap.put(view, y05Var2);
                }
                y05Var = (y05) y05Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y05Var;
    }

    /* JADX INFO: renamed from: s */
    public static final g12 m7394s() {
        g12 g12Var = f22861A;
        if (g12Var != null) {
            return g12Var;
        }
        f12 f12Var = new f12("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = uw4.f32218a;
        ga4 ga4Var = new ga4(pb0.f27495b);
        tv1 tv1Var = new tv1((byte) 1);
        tv1Var.m11175k(15.5f, 14.0f);
        tv1Var.m11172h(-0.79f);
        tv1Var.m11174j(-0.28f, -0.27f);
        tv1Var.m11169e(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        tv1Var.m11169e(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        tv1Var.m11176l(3.0f, 5.91f, 3.0f, 9.5f);
        tv1Var.m11176l(5.91f, 16.0f, 9.5f, 16.0f);
        tv1Var.m11170f(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        tv1Var.m11174j(0.27f, 0.28f);
        tv1Var.m11180p(0.79f);
        tv1Var.m11174j(5.0f, 4.99f);
        tv1Var.m11173i(20.49f, 19.0f);
        tv1Var.m11174j(-4.99f, -5.0f);
        tv1Var.m11168d();
        tv1Var.m11175k(9.5f, 14.0f);
        tv1Var.m11169e(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        tv1Var.m11176l(7.01f, 5.0f, 9.5f, 5.0f);
        tv1Var.m11176l(14.0f, 7.01f, 14.0f, 9.5f);
        tv1Var.m11176l(11.99f, 14.0f, 9.5f, 14.0f);
        tv1Var.m11168d();
        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
        g12 g12VarM5449e = f12Var.m5449e();
        f22861A = g12VarM5449e;
        return g12VarM5449e;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m7395t(int i, long j, int i2) {
        int iM7541k = kl0.m7541k(j);
        if (i > kl0.m7539i(j) || iM7541k > i) {
            return false;
        }
        return i2 <= kl0.m7538h(j) && kl0.m7540j(j) <= i2;
    }

    /* JADX INFO: renamed from: u */
    public static nt2 m7396u() {
        r50 r50Var = i41.f21117b;
        long jM3237P = as4.m3237P(1.2d, m41.SECONDS);
        x10 x10Var = new x10((byte) 1);
        x10Var.f33906b = jM3237P;
        VarHandle.storeStoreFence();
        return qq2.m10029m(kt2.f23428a, x10Var);
    }

    /* JADX INFO: renamed from: v */
    public static final y94 m7397v() {
        y94 y94Var = new y94();
        ha3 ha3Var = ha3.f20459c;
        e94 e94VarM7451h = k94.m7451h();
        x94 x94Var = new x94(e94VarM7451h.mo5015g(), ha3Var);
        if (!(e94VarM7451h instanceof rs1)) {
            x94Var.f22165b = new x94(1L, ha3Var);
        }
        y94Var.f35052a = x94Var;
        y94Var.f35053b = new l94(y94Var, (byte) 0);
        y94Var.f35054c = new l94(y94Var, (byte) 1);
        y94Var.f35055d = new l94(y94Var, (byte) 2);
        VarHandle.storeStoreFence();
        return y94Var;
    }

    /* JADX INFO: renamed from: w */
    public static d83 m7398w(Object obj) {
        return new d83(obj, ia5.f21230u);
    }

    /* JADX INFO: renamed from: x */
    public static final void m7399x(p84 p84Var, InterfaceC0618en interfaceC0618en, int i) {
        while (true) {
            int i2 = p84Var.f27454v;
            if (i > i2 && i < p84Var.f27453u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            p84Var.m9403N();
            if (p84Var.m9435x(p84Var.f27454v)) {
                interfaceC0618en.mo4835u();
            }
            p84Var.m9420i();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean mo6561i(AbstractC0857l2 abstractC0857l2, C0710h2 c0710h2, C0710h2 c0710h3) {
        synchronized (abstractC0857l2) {
            try {
                if (abstractC0857l2.f23718b != c0710h2) {
                    return false;
                }
                abstractC0857l2.f23718b = c0710h3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean mo6562j(AbstractC0857l2 abstractC0857l2, Object obj, Object obj2) {
        synchronized (abstractC0857l2) {
            try {
                if (abstractC0857l2.f23717a != obj) {
                    return false;
                }
                abstractC0857l2.f23717a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean mo6563k(AbstractC0857l2 abstractC0857l2, C0820k2 c0820k2, C0820k2 c0820k3) {
        synchronized (abstractC0857l2) {
            try {
                if (abstractC0857l2.f23719c != c0820k2) {
                    return false;
                }
                abstractC0857l2.f23719c = c0820k3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void onNavigationEvent(int i);

    /* JADX INFO: renamed from: y */
    public void mo6564y(C0820k2 c0820k2, C0820k2 c0820k3) {
        c0820k2.f22823b = c0820k3;
    }

    /* JADX INFO: renamed from: z */
    public void mo6565z(C0820k2 c0820k2, Thread thread) {
        c0820k2.f22822a = thread;
    }

    public void onPostMessage(String str) {
    }

    public void extraCallback() {
    }

    public void extraCallbackWithResult() {
    }

    public void onActivityResized() {
    }

    public void onMessageChannelReady() {
    }

    public void onRelationshipValidationResult() {
    }
}
