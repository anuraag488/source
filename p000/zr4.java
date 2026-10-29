package p000;

import java.lang.invoke.VarHandle;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zr4 {

    /* JADX INFO: renamed from: A */
    public static final pr4 f36292A;

    /* JADX INFO: renamed from: B */
    public static final x91 f36293B;

    /* JADX INFO: renamed from: a */
    public static final pr4 f36294a = m13733a(Class.class, new gr4().m11626a());

    /* JADX INFO: renamed from: b */
    public static final pr4 f36295b = m13733a(BitSet.class, new qr4().m11626a());

    /* JADX INFO: renamed from: c */
    public static final tr4 f36296c;

    /* JADX INFO: renamed from: d */
    public static final rr4 f36297d;

    /* JADX INFO: renamed from: e */
    public static final rr4 f36298e;

    /* JADX INFO: renamed from: f */
    public static final rr4 f36299f;

    /* JADX INFO: renamed from: g */
    public static final rr4 f36300g;

    /* JADX INFO: renamed from: h */
    public static final pr4 f36301h;

    /* JADX INFO: renamed from: i */
    public static final pr4 f36302i;

    /* JADX INFO: renamed from: j */
    public static final pr4 f36303j;

    /* JADX INFO: renamed from: k */
    public static final xq4 f36304k;

    /* JADX INFO: renamed from: l */
    public static final rr4 f36305l;

    /* JADX INFO: renamed from: m */
    public static final cr4 f36306m;

    /* JADX INFO: renamed from: n */
    public static final dr4 f36307n;

    /* JADX INFO: renamed from: o */
    public static final er4 f36308o;

    /* JADX INFO: renamed from: p */
    public static final pr4 f36309p;

    /* JADX INFO: renamed from: q */
    public static final pr4 f36310q;

    /* JADX INFO: renamed from: r */
    public static final pr4 f36311r;

    /* JADX INFO: renamed from: s */
    public static final pr4 f36312s;

    /* JADX INFO: renamed from: t */
    public static final pr4 f36313t;

    /* JADX INFO: renamed from: u */
    public static final pr4 f36314u;

    /* JADX INFO: renamed from: v */
    public static final pr4 f36315v;

    /* JADX INFO: renamed from: w */
    public static final pr4 f36316w;

    /* JADX INFO: renamed from: x */
    public static final i23 f36317x;

    /* JADX INFO: renamed from: y */
    public static final pr4 f36318y;

    /* JADX INFO: renamed from: z */
    public static final ga2 f36319z;

    static {
        sr4 sr4Var = new sr4();
        f36296c = new tr4();
        f36297d = m13734b(Boolean.TYPE, Boolean.class, sr4Var);
        f36298e = m13734b(Byte.TYPE, Byte.class, new ur4());
        f36299f = m13734b(Short.TYPE, Short.class, new vr4());
        f36300g = m13734b(Integer.TYPE, Integer.class, new wr4());
        f36301h = m13733a(AtomicInteger.class, new xr4().m11626a());
        f36302i = m13733a(AtomicBoolean.class, new yr4().m11626a());
        f36303j = m13733a(AtomicIntegerArray.class, new wq4().m11626a());
        f36304k = new xq4();
        new yq4();
        new zq4();
        f36305l = m13734b(Character.TYPE, Character.class, new ar4());
        br4 br4Var = new br4();
        f36306m = new cr4();
        f36307n = new dr4();
        f36308o = new er4();
        f36309p = m13733a(String.class, br4Var);
        f36310q = m13733a(StringBuilder.class, new fr4());
        f36311r = m13733a(StringBuffer.class, new hr4());
        f36312s = m13733a(URL.class, new ir4());
        f36313t = m13733a(URI.class, new jr4());
        kr4 kr4Var = new kr4();
        byte b = 1;
        pr4 pr4Var = new pr4(b);
        pr4Var.f27921b = InetAddress.class;
        pr4Var.f27922c = kr4Var;
        VarHandle.storeStoreFence();
        f36314u = pr4Var;
        f36315v = m13733a(UUID.class, new lr4());
        f36316w = m13733a(Currency.class, new mr4().m11626a());
        nr4 nr4Var = new nr4();
        i23 i23Var = new i23(b);
        i23Var.f21063b = nr4Var;
        VarHandle.storeStoreFence();
        f36317x = i23Var;
        f36318y = m13733a(Locale.class, new or4());
        ga2 ga2Var = ga2.f19689a;
        f36319z = ga2Var;
        pr4 pr4Var2 = new pr4(b);
        pr4Var2.f27921b = ba2.class;
        pr4Var2.f27922c = ga2Var;
        VarHandle.storeStoreFence();
        f36292A = pr4Var2;
        f36293B = y91.f35037d;
    }

    /* JADX INFO: renamed from: a */
    public static pr4 m13733a(Class cls, uq4 uq4Var) {
        pr4 pr4Var = new pr4((byte) 0);
        pr4Var.f27921b = cls;
        pr4Var.f27922c = uq4Var;
        VarHandle.storeStoreFence();
        return pr4Var;
    }

    /* JADX INFO: renamed from: b */
    public static rr4 m13734b(Class cls, Class cls2, uq4 uq4Var) {
        rr4 rr4Var = new rr4();
        rr4Var.f29551a = cls;
        rr4Var.f29552b = cls2;
        rr4Var.f29553c = uq4Var;
        VarHandle.storeStoreFence();
        return rr4Var;
    }
}
