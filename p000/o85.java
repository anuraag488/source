package p000;

import ads_mobile_sdk.EnumC0139h2;
import android.content.Context;
import android.view.WindowManager;
import java.io.FileInputStream;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o85 implements qo0, r94, t24, hj3, h15, jx0 {

    /* JADX INFO: renamed from: A */
    public static final o85 f26439A;

    /* JADX INFO: renamed from: B */
    public static final o85 f26440B;

    /* JADX INFO: renamed from: C */
    public static final o85 f26441C;

    /* JADX INFO: renamed from: d */
    public static lk3 f26444d;

    /* JADX INFO: renamed from: l */
    public static final d73 f26452l;

    /* JADX INFO: renamed from: m */
    public static final o85 f26453m;

    /* JADX INFO: renamed from: n */
    public static final o85 f26454n;

    /* JADX INFO: renamed from: o */
    public static final o85 f26455o;

    /* JADX INFO: renamed from: p */
    public static final o85 f26456p;

    /* JADX INFO: renamed from: q */
    public static jk3 f26457q;

    /* JADX INFO: renamed from: r */
    public static final o85 f26458r;

    /* JADX INFO: renamed from: s */
    public static final o85 f26459s;

    /* JADX INFO: renamed from: t */
    public static final o85 f26460t;

    /* JADX INFO: renamed from: u */
    public static final o85 f26461u;

    /* JADX INFO: renamed from: v */
    public static final o85 f26462v;

    /* JADX INFO: renamed from: w */
    public static final o85 f26463w;

    /* JADX INFO: renamed from: x */
    public static final o85 f26464x;

    /* JADX INFO: renamed from: y */
    public static final o85 f26465y;

    /* JADX INFO: renamed from: z */
    public static final o85 f26466z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26467a;

    /* JADX INFO: renamed from: b */
    public static final o85 f26442b = new o85(1);

    /* JADX INFO: renamed from: c */
    public static final o85 f26443c = new o85(2);

    /* JADX INFO: renamed from: e */
    public static final o85 f26445e = new o85(4);

    /* JADX INFO: renamed from: f */
    public static final o85 f26446f = new o85(5);

    /* JADX INFO: renamed from: g */
    public static final jl3 f26447g = new jl3(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ o85 f26448h = new o85(7);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ o85 f26449i = new o85(8);

    /* JADX INFO: renamed from: j */
    public static final o85 f26450j = new o85(9);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ o85 f26451k = new o85(10);

    static {
        d73 d73Var = new d73();
        VarHandle.storeStoreFence();
        f26452l = d73Var;
        f26453m = new o85((byte) 11);
        f26454n = new o85((byte) 12);
        f26455o = new o85((byte) 13);
        f26456p = new o85((byte) 14);
        f26458r = new o85((byte) 15);
        f26459s = new o85((byte) 16);
        f26460t = new o85((byte) 17);
        f26461u = new o85((byte) 18);
        f26462v = new o85((byte) 19);
        f26463w = new o85((byte) 20);
        f26464x = new o85((byte) 21);
        f26465y = new o85((byte) 22);
        f26466z = new o85((byte) 23);
        f26439A = new o85((byte) 24);
        f26440B = new o85((byte) 25);
        f26441C = new o85((byte) 26);
    }

    public /* synthetic */ o85(byte b) {
        this.f26467a = b;
    }

    /* JADX INFO: renamed from: e */
    public static EnumC0139h2 m8987e(int i) throws Exception {
        EnumC0139h2 enumC0139h2 = (EnumC0139h2) EnumC0139h2.f4231c.get(Integer.valueOf(i));
        if (enumC0139h2 != null) {
            return enumC0139h2;
        }
        throw new Exception("Invalid value for enum " + o85.class.getName() + ": " + i);
    }

    /* JADX INFO: renamed from: f */
    public static ru0 m8988f(t24 t24Var, t31 t31Var, zo0 zo0Var, wp1 wp1Var, int i) {
        if ((i & 2) != 0) {
            t31Var = null;
        }
        C1283w7 c1283w7 = new C1283w7(new cf1(t24Var, wp1Var), zo0Var.mo6367f().get(f26448h) == null ? zo0Var.mo6367f().plus(y70.m13021a()) : zo0Var.mo6367f());
        if (t31Var != null) {
            c1283w7.f33129e = t31Var;
        }
        v71 v71Var = v71.f32439a;
        c1283w7.f33126b = hb0.m6310V0(v71Var, v71Var);
        return c1283w7.m12143o();
    }

    @Override // p000.jx0
    /* JADX INFO: renamed from: a */
    public boolean mo4903a(SSLSocket sSLSocket) {
        return od4.m9043X(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p000.jx0
    /* JADX INFO: renamed from: b */
    public ca4 mo4904b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        C1107rg c1107rg = new C1107rg();
        c1107rg.f29230a = superclass;
        c1107rg.f29231b = superclass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        c1107rg.f29232c = superclass.getMethod("setHostname", String.class);
        c1107rg.f29233d = superclass.getMethod("getAlpnSelectedProtocol", null);
        c1107rg.f29234e = superclass.getMethod("setAlpnProtocols", byte[].class);
        VarHandle.storeStoreFence();
        return c1107rg;
    }

    @Override // p000.h15
    /* JADX INFO: renamed from: c */
    public d15 mo6203c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        return new d15(windowManager.getCurrentWindowMetrics().getBounds(), context.getResources().getDisplayMetrics().density);
    }

    @Override // p000.r94
    /* JADX INFO: renamed from: d */
    public boolean mo6713d(Object obj, Object obj2) {
        switch (this.f26467a) {
            case 9:
                return false;
            default:
                return obj == obj2;
        }
    }

    @Override // p000.t24
    public Object getDefaultValue() {
        return new hw2(true);
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public float mo6008i(float f) {
        double d = f;
        return (float) (d <= 0.04045d ? d / 12.92d : as4.m3234M((d + 0.055d) / 1.055d, 2.4d));
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public float mo6009j(float f) {
        double d = f;
        return (float) (d <= 0.0031308d ? d * 12.92d : (as4.m3234M(d, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    @Override // p000.t24
    public Object readFrom(FileInputStream fileInputStream) throws gp0 {
        try {
            ce3 ce3VarM3988p = ce3.m3988p(fileInputStream);
            hw2 hw2Var = new hw2(false);
            yd3[] yd3VarArr = (yd3[]) Arrays.copyOf(new yd3[0], 0);
            hw2Var.m6524b();
            if (yd3VarArr.length > 0) {
                yd3 yd3Var = yd3VarArr[0];
                throw null;
            }
            for (Map.Entry entry : ce3VarM3988p.m3990m().entrySet()) {
                String str = (String) entry.getKey();
                ge3 ge3Var = (ge3) entry.getValue();
                int iM5996v = ge3Var.m5996v();
                switch (iM5996v == 0 ? -1 : zd3.f35997a[d55.m4376u(iM5996v)]) {
                    case -1:
                        throw new gp0("Value case is null.", null);
                    case 0:
                    default:
                        C0670g.m5864c();
                        return null;
                    case 1:
                        hw2Var.m6527e(new xd3(str), Boolean.valueOf(ge3Var.m5988m()));
                        break;
                    case 2:
                        hw2Var.m6527e(new xd3(str), Float.valueOf(ge3Var.m5991q()));
                        break;
                    case 3:
                        hw2Var.m6527e(new xd3(str), Double.valueOf(ge3Var.m5990p()));
                        break;
                    case 4:
                        hw2Var.m6527e(new xd3(str), Integer.valueOf(ge3Var.m5992r()));
                        break;
                    case 5:
                        hw2Var.m6527e(new xd3(str), Long.valueOf(ge3Var.m5993s()));
                        break;
                    case 6:
                        hw2Var.m6527e(new xd3(str), ge3Var.m5994t());
                        break;
                    case 7:
                        hw2Var.m6527e(new xd3(str), hb0.m6322h1(ge3Var.m5995u().m5104o()));
                        break;
                    case 8:
                        hw2Var.m6527e(new xd3(str), ge3Var.m5989n().m8527q());
                        break;
                    case 9:
                        throw new gp0("Value not set.", null);
                }
            }
            return new hw2(new LinkedHashMap(hw2Var.m6523a()), true);
        } catch (i72 e) {
            throw new gp0("Unable to parse preferences proto. Consider providing a CorruptionHandler to the DataStore factory to handle such scenarios.", e);
        }
    }

    public String toString() {
        switch (this.f26467a) {
            case 9:
                return "NeverEqualPolicy";
            case 12:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // p000.t24
    public void writeTo(Object obj, xt4 xt4Var) {
        vr1 vr1VarM10045a;
        Map mapM6523a = ((hw2) obj).m6523a();
        ae3 ae3VarM3987o = ce3.m3987o();
        for (Map.Entry entry : mapM6523a.entrySet()) {
            xd3 xd3Var = (xd3) entry.getKey();
            Object value = entry.getValue();
            String str = xd3Var.f34170a;
            if (value instanceof Boolean) {
                fe3 fe3VarM5982w = ge3.m5982w();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                fe3VarM5982w.m10047c();
                ((ge3) fe3VarM5982w.f28725b).m5997x(zBooleanValue);
                vr1VarM10045a = fe3VarM5982w.m10045a();
            } else if (value instanceof Float) {
                fe3 fe3VarM5982w2 = ge3.m5982w();
                float fFloatValue = ((Number) value).floatValue();
                fe3VarM5982w2.m10047c();
                ((ge3) fe3VarM5982w2.f28725b).m5983A(fFloatValue);
                vr1VarM10045a = fe3VarM5982w2.m10045a();
            } else if (value instanceof Double) {
                fe3 fe3VarM5982w3 = ge3.m5982w();
                double dDoubleValue = ((Number) value).doubleValue();
                fe3VarM5982w3.m10047c();
                ((ge3) fe3VarM5982w3.f28725b).m5999z(dDoubleValue);
                vr1VarM10045a = fe3VarM5982w3.m10045a();
            } else if (value instanceof Integer) {
                fe3 fe3VarM5982w4 = ge3.m5982w();
                int iIntValue = ((Number) value).intValue();
                fe3VarM5982w4.m10047c();
                ((ge3) fe3VarM5982w4.f28725b).m5984B(iIntValue);
                vr1VarM10045a = fe3VarM5982w4.m10045a();
            } else if (value instanceof Long) {
                fe3 fe3VarM5982w5 = ge3.m5982w();
                long jLongValue = ((Number) value).longValue();
                fe3VarM5982w5.m10047c();
                ((ge3) fe3VarM5982w5.f28725b).m5985C(jLongValue);
                vr1VarM10045a = fe3VarM5982w5.m10045a();
            } else if (value instanceof String) {
                fe3 fe3VarM5982w6 = ge3.m5982w();
                fe3VarM5982w6.m10047c();
                ((ge3) fe3VarM5982w6.f28725b).m5986D((String) value);
                vr1VarM10045a = fe3VarM5982w6.m10045a();
            } else if (value instanceof Set) {
                fe3 fe3VarM5982w7 = ge3.m5982w();
                de3 de3VarM5102p = ee3.m5102p();
                de3VarM5102p.m10047c();
                ((ee3) de3VarM5102p.f28725b).m5103m((Set) value);
                fe3VarM5982w7.m10047c();
                ((ge3) fe3VarM5982w7.f28725b).m5987E((ee3) de3VarM5102p.m10045a());
                vr1VarM10045a = fe3VarM5982w7.m10045a();
            } else {
                if (!(value instanceof byte[])) {
                    C1077qn.m9989o("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                fe3 fe3VarM5982w8 = ge3.m5982w();
                byte[] bArr = (byte[]) value;
                try {
                    p50 p50VarM8525b = n50.m8525b(bArr, 0, bArr.length);
                    fe3VarM5982w8.m10047c();
                    ((ge3) fe3VarM5982w8.f28725b).m5998y(p50VarM8525b);
                    vr1VarM10045a = fe3VarM5982w8.m10045a();
                } catch (i72 e) {
                    xy4.m12790s("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    return;
                }
            }
            ae3VarM3987o.getClass();
            Objects.requireNonNull(str);
            ae3VarM3987o.m10047c();
            ((ce3) ae3VarM3987o.f28725b).m3991n().put(str, (ge3) vr1VarM10045a);
        }
        ce3 ce3Var = (ce3) ae3VarM3987o.m10045a();
        int iMo11979a = ce3Var.mo11979a(null);
        if (iMo11979a > 4096) {
            iMo11979a = 4096;
        }
        C1145sh c1145sh = new C1145sh();
        c1145sh.f30266e = xt4Var;
        if (iMo11979a < 0) {
            C1077qn.m9987m("bufferSize must be >= 0");
            return;
        }
        int iMax = Math.max(iMo11979a, 20);
        c1145sh.f30265d = new byte[iMax];
        c1145sh.f30262a = iMax;
        VarHandle.storeStoreFence();
        ce3Var.m11984l(c1145sh);
        if (c1145sh.f30263b > 0) {
            c1145sh.m10770k();
        }
    }
}
