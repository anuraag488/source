package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.ey0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks5 {

    /* JADX INFO: renamed from: a */
    public static dt0 f23392a;

    /* JADX INFO: renamed from: g */
    public static final pg0 f23398g;

    /* JADX INFO: renamed from: l */
    public static final z45 f23403l;

    /* JADX INFO: renamed from: n */
    public static g12 f23405n;

    /* JADX INFO: renamed from: o */
    public static g12 f23406o;

    /* JADX INFO: renamed from: b */
    public static final float[][] f23393b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: c */
    public static final float[][] f23394c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: d */
    public static final float[] f23395d = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: e */
    public static final double[][] f23396e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: f */
    public static final double[][] f23397f = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: h */
    public static final pg0 f23399h = new pg0(2146385724, false, new xg0(12));

    /* JADX INFO: renamed from: i */
    public static final dh0 f23400i = new dh0(15);

    /* JADX INFO: renamed from: j */
    public static final Object f23401j = new Object();

    /* JADX INFO: renamed from: k */
    public static final long[] f23402k = new long[0];

    /* JADX INFO: renamed from: m */
    public static final z45 f23404m = new z45(0);

    static {
        byte b = 11;
        f23398g = new pg0(-1968209730, false, new xg0(b));
        f23403l = new z45(b);
    }

    /* JADX INFO: renamed from: A */
    public static final void m7595A(sq2 sq2Var, dk1 dk1Var, long j, yp1 yp1Var) {
        if (y70.m13044y(y70.m13043x(sq2Var)) != 0.0f) {
            dk1Var.getClass();
            sq2Var.mo5825b0(sq2Var.mo5823W(Integer.MAX_VALUE));
            return;
        }
        y70.m13043x(sq2Var);
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        yp1Var.invoke(db3VarMo5826e);
        dk1Var.getClass();
        db3VarMo5826e.mo4421j0();
        db3VarMo5826e.mo4420i0();
    }

    /* JADX INFO: renamed from: C */
    public static C0795je m7596C(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zM9043X = od4.m9043X(str, "HTTP/1.", false);
        byte b = 7;
        wh3 wh3Var = wh3.HTTP_1_0;
        if (zM9043X) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                wh3Var = wh3.HTTP_1_1;
            }
        } else {
            if (!od4.m9043X(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            C0795je c0795je = new C0795je(b);
            c0795je.f22194c = wh3Var;
            c0795je.f22193b = i3;
            c0795je.f22195d = strSubstring;
            VarHandle.storeStoreFence();
            return c0795je;
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m7597D(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public static final void m7598E(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("Illegal index " + i + ", " + str + " expects only non-negative indices");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:12:0x0012, B:14:0x001e, B:19:0x0029, B:20:0x0036, B:22:0x003a, B:23:0x0041), top: B:27:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:12:0x0012, B:14:0x001e, B:19:0x0029, B:20:0x0036, B:22:0x003a, B:23:0x0041), top: B:27:0x0003, inners: #1 }] */
    /* JADX INFO: renamed from: F */
    public static dt0 m7599F(Context context, nr0 nr0Var) {
        dt0 x16Var;
        synchronized (ks5.class) {
            if (f23392a == null) {
                boolean z = true;
                if (nr0Var != nr0.CRONET_SOURCE_PLATFORM && nr0Var != nr0.CRONET_SOURCE_PLAY_SERVICES) {
                    z = false;
                }
                if (qs5.m10095T(context).getBoolean("android.net.http.EnableTelemetry", z)) {
                    try {
                        f23392a = new cq5();
                    } catch (Exception e) {
                        Log.e("cn_".concat("ks5"), "Exception creating an instance of CronetLoggerImpl", e);
                    }
                    x16Var = f23392a;
                    if (x16Var == null) {
                        x16Var = new x16();
                        f23392a = x16Var;
                    }
                } else {
                    x16Var = f23392a;
                    if (x16Var == null) {
                        x16Var = new x16();
                        f23392a = x16Var;
                    }
                }
            } else {
                x16Var = f23392a;
                if (x16Var == null) {
                    x16Var = new x16();
                    f23392a = x16Var;
                }
            }
            throw th;
        }
        return x16Var;
    }

    /* JADX INFO: renamed from: a */
    public static final C0831kd m7600a(String str) {
        Set setSingleton = Collections.singleton(str);
        C0831kd c0831kd = new C0831kd();
        c0831kd.f23070b = setSingleton;
        VarHandle.storeStoreFence();
        return c0831kd;
    }

    /* JADX INFO: renamed from: b */
    public static final void m7601b(float f, nt2 nt2Var, ma0 ma0Var, yp1 yp1Var, yp1 yp1Var2, yp1 yp1Var3, boolean z, nv2 nv2Var, u74 u74Var, mi0 mi0Var, int i) {
        nv2 nv2Var2;
        nv2 nv2Var3;
        Object obj;
        boolean z2 = z;
        u74 u74Var2 = u74Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(60823557);
        int i2 = i | (ir1Var.m6884d(f) ? 4 : 2) | (ir1Var.m6890g(nt2Var) ? 32 : 16) | (ir1Var.m6890g(ma0Var) ? 256 : 128) | (ir1Var.m6894i(yp1Var) ? 2048 : 1024) | (ir1Var.m6894i(yp1Var2) ? 16384 : 8192) | (ir1Var.m6894i(yp1Var3) ? 131072 : 65536) | (ir1Var.m6892h(z2) ? 1048576 : 524288) | 12582912 | (ir1Var.m6890g(u74Var2) ? 67108864 : 33554432);
        if (ir1Var.m6871T(i2 & 1, (38347923 & i2) != 38347922)) {
            ir1Var.m6876Y();
            int i3 = i & 1;
            i50 i50Var = ki0.f23136a;
            if (i3 == 0 || ir1Var.m6856B()) {
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2Var3 = (nv2) objM6869O;
            } else {
                ir1Var.m6874W();
                nv2Var3 = nv2Var;
            }
            ir1Var.m6913s();
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O2);
            }
            sw2 sw2Var = (sw2) objM6869O2;
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            boolean zM6890g = ir1Var.m6890g(lv1Var);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj2 = objM6869O3;
            if (zM6890g || objM6869O3 == i50Var) {
                kv1 kv1Var = new kv1();
                kv1Var.f23536b = lv1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(kv1Var);
                obj2 = kv1Var;
            }
            kv1 kv1Var2 = (kv1) obj2;
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = new mx4();
                ir1Var.m6905n0(objM6869O4);
            }
            mx4 mx4Var = (mx4) objM6869O4;
            Object objM6869O5 = ir1Var.m6869O();
            if (objM6869O5 == i50Var) {
                objM6869O5 = new a83(0);
                ir1Var.m6905n0(objM6869O5);
            }
            a83 a83Var = (a83) objM6869O5;
            Object objM6869O6 = ir1Var.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = new z73(0.0f);
                ir1Var.m6905n0(objM6869O6);
            }
            z73 z73Var = (z73) objM6869O6;
            Float f2 = (Float) sw2Var.getValue();
            float fFloatValue = f2 != null ? f2.floatValue() : f;
            Object objM6869O7 = ir1Var.m6869O();
            if (objM6869O7 == i50Var) {
                sa1 sa1Var = new sa1((byte) 0);
                sa1Var.f30034b = a83Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(sa1Var);
                obj = sa1Var;
            } else {
                obj = objM6869O7;
            }
            nt2 nt2VarM6101z = gq6.m6101z(nt2Var, (yp1) obj);
            boolean zM6890g2 = ((((i2 & 896) ^ 384) > 256 && ir1Var.m6890g(ma0Var)) || (i2 & 384) == 256) | ((458752 & i2) == 131072) | ((i2 & 7168) == 2048) | ir1Var.m6890g(kv1Var2);
            Object objM6869O8 = ir1Var.m6869O();
            Object obj3 = objM6869O8;
            if (zM6890g2 || objM6869O8 == i50Var) {
                C0869le c0869le = new C0869le((byte) 4);
                c0869le.f23972f = yp1Var3;
                c0869le.f23968b = ma0Var;
                c0869le.f23969c = yp1Var;
                c0869le.f23970d = kv1Var2;
                c0869le.f23971e = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0869le);
                obj3 = c0869le;
            }
            yp1 yp1Var4 = (yp1) obj3;
            boolean zM6890g3 = ir1Var.m6890g(kv1Var2) | ir1Var.m6894i(mx4Var) | ((i2 & 57344) == 16384);
            Object objM6869O9 = ir1Var.m6869O();
            Object obj4 = objM6869O9;
            if (zM6890g3 || objM6869O9 == i50Var) {
                C0907mf c0907mf = new C0907mf((byte) 1);
                c0907mf.f24849b = kv1Var2;
                c0907mf.f24850c = mx4Var;
                c0907mf.f24851d = yp1Var2;
                c0907mf.f24852e = z73Var;
                c0907mf.f24853f = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0907mf);
                obj4 = c0907mf;
            }
            z2 = z;
            nv2Var2 = nv2Var3;
            u74Var2 = u74Var;
            j84.m7047a(fFloatValue, yp1Var4, nt2VarM6101z, z2, ma0Var, (wp1) obj4, u74Var2, nv2Var2, ir1Var, ((i2 >> 9) & 7168) | ((i2 << 6) & 57344) | ((i2 >> 3) & 29360128) | 100663296);
        } else {
            ir1Var.m6874W();
            nv2Var2 = nv2Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ta1 ta1Var = new ta1();
            ta1Var.f31027a = f;
            ta1Var.f31028b = nt2Var;
            ta1Var.f31029c = ma0Var;
            ta1Var.f31030d = yp1Var;
            ta1Var.f31031e = yp1Var2;
            ta1Var.f31032f = yp1Var3;
            ta1Var.f31033g = z2;
            ta1Var.f31034h = nv2Var2;
            ta1Var.f31035i = u74Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ta1Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7602c(nt2 nt2Var, InterfaceC1188tn interfaceC1188tn, InterfaceC1299wn interfaceC1299wn, C0816jz c0816jz, int i, int i2, pg0 pg0Var, mi0 mi0Var, int i3) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1303174015);
        int i4 = i3 | 224256;
        byte b = 1;
        if (ir1Var.m6871T(i4 & 1, (599187 & i4) != 599186)) {
            C0816jz c0816jz2 = ig1.f21387k;
            m7603d(nt2Var, interfaceC1188tn, interfaceC1299wn, ek1.f18169b, pg0Var, ir1Var, 14380470);
            pg0Var = pg0Var;
            i = Integer.MAX_VALUE;
            i2 = Integer.MAX_VALUE;
            c0816jz = c0816jz2;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0462ap c0462ap = new C0462ap(b);
            c0462ap.f14756b = nt2Var;
            c0462ap.f14759e = interfaceC1188tn;
            c0462ap.f14760f = interfaceC1299wn;
            c0462ap.f14761g = c0816jz;
            c0462ap.f14757c = i;
            c0462ap.f14758d = i2;
            c0462ap.f14762h = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0462ap;
        }
    }

    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX INFO: renamed from: d */
    public static final void m7603d(nt2 nt2Var, InterfaceC1188tn interfaceC1188tn, InterfaceC1299wn interfaceC1299wn, ek1 ek1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ?? r13;
        Object obj;
        C0816jz c0816jz = ig1.f21387k;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1956591841);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(interfaceC1188tn) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(interfaceC1299wn) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(c0816jz) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6886e(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6886e(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6890g(ek1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 8388608 : 4194304;
        }
        if (ir1Var.m6871T(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 3670016 & i2;
            boolean z = i3 == 1048576;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj2 = objM6869O;
            if (z || objM6869O == i50Var) {
                zj1 zj1Var = ek1Var.f18170a;
                bk1 bk1Var = new bk1();
                bk1Var.f15348a = zj1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(bk1Var);
                obj2 = bk1Var;
            }
            bk1 bk1Var2 = (bk1) obj2;
            int i4 = i2 >> 3;
            boolean zM6890g = ((((i4 & 896) ^ 384) > 256 && ir1Var.m6890g(c0816jz)) || (i4 & 384) == 256) | ((((i4 & 112) ^ 48) > 32 && ir1Var.m6890g(interfaceC1299wn)) || (i4 & 48) == 32) | ((((i4 & 14) ^ 6) > 4 && ir1Var.m6890g(interfaceC1188tn)) || (i4 & 6) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && ir1Var.m6886e(Integer.MAX_VALUE)) || (i4 & 3072) == 2048) | ((((57344 & i4) ^ 24576) > 16384 && ir1Var.m6886e(Integer.MAX_VALUE)) || (i4 & 24576) == 16384) | ir1Var.m6890g(bk1Var2);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6890g || objM6869O2 == i50Var) {
                float fMo11068a = interfaceC1188tn.mo11068a();
                ur0 ur0Var = new ur0();
                VarHandle.storeStoreFence();
                float fMo11068a2 = interfaceC1299wn.mo11068a();
                dk1 dk1Var = new dk1();
                dk1Var.f17113a = interfaceC1188tn;
                dk1Var.f17114b = interfaceC1299wn;
                dk1Var.f17115c = fMo11068a;
                dk1Var.f17116d = ur0Var;
                dk1Var.f17117e = fMo11068a2;
                dk1Var.f17118f = bk1Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(dk1Var);
                objM6869O2 = dk1Var;
            }
            dk1 dk1Var2 = (dk1) objM6869O2;
            boolean z2 = (i3 == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 458752) == 131072);
            Object objM6869O3 = ir1Var.m6869O();
            if (z2 || objM6869O3 == i50Var) {
                ArrayList arrayList = new ArrayList();
                h02 h02Var = new h02((byte) 4);
                h02Var.f20244b = pg0Var;
                VarHandle.storeStoreFence();
                r13 = 1;
                arrayList.add(new pg0(-1192950673, true, h02Var));
                ek1Var.getClass();
                ek1Var.f18170a.ordinal();
                ir1Var.m6905n0(arrayList);
                obj = arrayList;
            } else {
                r13 = 1;
                obj = objM6869O3;
            }
            de0 de0Var = new de0(r13);
            de0Var.f16999b = (List) obj;
            VarHandle.storeStoreFence();
            pg0 pg0Var2 = new pg0(1271844412, r13, de0Var);
            boolean zM6890g2 = ir1Var.m6890g(dk1Var2);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj3 = objM6869O4;
            if (zM6890g2 || objM6869O4 == i50Var) {
                vu2 vu2Var = new vu2();
                vu2Var.f32879a = dk1Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(vu2Var);
                obj3 = vu2Var;
            }
            xq2 xq2Var = (xq2) obj3;
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2Var);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            pg0Var2.invoke(ir1Var, 0);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0963ny c0963ny = new C0963ny((byte) 2);
            c0963ny.f26187g = nt2Var;
            c0963ny.f26184d = interfaceC1188tn;
            c0963ny.f26185e = interfaceC1299wn;
            c0963ny.f26186f = ek1Var;
            c0963ny.f26182b = pg0Var;
            c0963ny.f26183c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0963ny;
        }
    }

    /* JADX WARN: Code duplicated, block: B:282:0x04a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m7604e(nt2 nt2Var, si2 si2Var, e73 e73Var, boolean z, xh1 xh1Var, boolean z2, C1289wd c1289wd, C0779iz c0779iz, InterfaceC1299wn interfaceC1299wn, C0816jz c0816jz, InterfaceC1188tn interfaceC1188tn, yp1 yp1Var, mi0 mi0Var, int i, int i2, int i3) {
        int i4;
        C0779iz c0779iz2;
        int i5;
        int i6;
        nt2 nt2Var2;
        si2 si2Var2;
        boolean z3;
        InterfaceC1299wn interfaceC1299wn2;
        C0816jz c0816jz2;
        InterfaceC1188tn interfaceC1188tn2;
        ir1 ir1Var;
        InterfaceC1299wn interfaceC1299wn3;
        int i7;
        C0779iz c0779iz3;
        C0816jz c0816jz3;
        InterfaceC1188tn interfaceC1188tn3;
        nt2 nt2VarM3229H;
        Object obj;
        boolean z4;
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6889f0(924924659);
        if ((i & 6) == 0) {
            i4 = (ir1Var2.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ir1Var2.m6890g(si2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ir1Var2.m6890g(e73Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ir1Var2.m6892h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ir1Var2.m6892h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ir1Var2.m6890g(xh1Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= ir1Var2.m6892h(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ir1Var2.m6890g(c1289wd) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i8 = i3 & 512;
        if (i8 != 0) {
            i4 |= 805306368;
            c0779iz2 = c0779iz;
        } else {
            c0779iz2 = c0779iz;
            if ((i & 805306368) == 0) {
                i4 |= ir1Var2.m6890g(c0779iz2) ? 536870912 : 268435456;
            }
        }
        int i9 = i3 & 1024;
        if (i9 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (ir1Var2.m6890g(interfaceC1299wn) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2048;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= ir1Var2.m6890g(c0816jz) ? 32 : 16;
        }
        int i11 = i5;
        int i12 = i3 & 4096;
        if (i12 != 0) {
            i6 = i11 | 384;
        } else if ((i2 & 384) == 0) {
            i6 = i11 | (ir1Var2.m6890g(interfaceC1188tn) ? 256 : 128);
        } else {
            i6 = i11;
        }
        if ((i2 & 3072) == 0) {
            i6 |= ir1Var2.m6894i(yp1Var) ? 2048 : 1024;
        }
        int i13 = i6;
        if (ir1Var2.m6871T(i4 & 1, ((i4 & 306783379) == 306783378 && (i13 & 1171) == 1170) ? false : true)) {
            ir1Var2.m6876Y();
            if ((i & 1) == 0 || ir1Var2.m6856B()) {
                int i14 = i4 & (-234881025);
                if (i8 != 0) {
                    c0779iz2 = null;
                }
                interfaceC1299wn3 = i9 != 0 ? null : interfaceC1299wn;
                i7 = i14;
                c0779iz3 = c0779iz2;
                c0816jz3 = i10 != 0 ? null : c0816jz;
                interfaceC1188tn3 = i12 != 0 ? null : interfaceC1188tn;
            } else {
                ir1Var2.m6874W();
                interfaceC1299wn3 = interfaceC1299wn;
                interfaceC1188tn3 = interfaceC1188tn;
                i7 = i4 & (-234881025);
                c0779iz3 = c0779iz2;
                c0816jz3 = c0816jz;
            }
            ir1Var2.m6913s();
            int i15 = i7 >> 3;
            int i16 = i15 & 14;
            int i17 = i16 | ((i13 >> 6) & 112);
            sw2 sw2VarM7369C = k43.m7369C(yp1Var, ir1Var2);
            boolean z5 = (((i17 & 14) ^ 6) > 4 && ir1Var2.m6890g(si2Var)) || (i17 & 6) == 4;
            Object objM6869O = ir1Var2.m6869O();
            boolean z6 = z5;
            i50 i50Var = ki0.f23136a;
            if (z6 || objM6869O == i50Var) {
                sg2 sg2Var = new sg2();
                sg2Var.f30240a = new a83(Integer.MAX_VALUE);
                sg2Var.f30241b = new a83(Integer.MAX_VALUE);
                o85 o85Var = o85.f26454n;
                C0725hh c0725hh = new C0725hh((byte) 11);
                c0725hh.f20571b = sw2VarM7369C;
                VarHandle.storeStoreFence();
                tt2 tt2Var = s94.f30014a;
                wy0 wy0Var = new wy0(c0725hh, o85Var);
                C1048pv c1048pv = new C1048pv((byte) 9);
                c1048pv.f28016b = wy0Var;
                c1048pv.f28017c = si2Var;
                c1048pv.f28018d = sg2Var;
                VarHandle.storeStoreFence();
                objM6869O = new ii2(new wy0(c1048pv, o85Var), xb4.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 0);
                ir1Var2.m6905n0(objM6869O);
            }
            hh3 hh3Var = (hh3) objM6869O;
            int i18 = i7 >> 9;
            int i19 = i18 & 112;
            int i20 = i16 | i19;
            boolean z7 = ((((i20 & 14) ^ 6) > 4 && ir1Var2.m6890g(si2Var)) || (i20 & 6) == 4) | ((((i20 & 112) ^ 48) > 32 && ir1Var2.m6892h(z)) || (i20 & 48) == 32);
            Object objM6869O2 = ir1Var2.m6869O();
            Object obj2 = objM6869O2;
            if (z7 || objM6869O2 == i50Var) {
                yh2 yh2Var = new yh2();
                yh2Var.f35226b = si2Var;
                yh2Var.f35227c = z;
                xh2 xh2Var = new xh2((byte) 0);
                xh2Var.f34280b = si2Var;
                VarHandle.storeStoreFence();
                yh2Var.f35225a = s94.m10566b(xh2Var);
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(yh2Var);
                obj2 = yh2Var;
            }
            yh2 yh2Var2 = (yh2) obj2;
            Object objM6869O3 = ir1Var2.m6869O();
            if (objM6869O3 == i50Var) {
                objM6869O3 = lb5.m7942w(r71.f29063a, ir1Var2);
                ir1Var2.m6905n0(objM6869O3);
            }
            zo0 zo0Var = (zo0) objM6869O3;
            au1 au1Var = (au1) ir1Var2.m6898k(ij0.f21472g);
            h50 h50Var = ((Boolean) ir1Var2.m6898k(ij0.f21489x)).booleanValue() ? null : qc4.f28387a;
            int i21 = i7 & 112;
            int i22 = i13 << 18;
            int i23 = (i7 & 65520) | (i18 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i13 << 27) & 1879048192);
            boolean zM6886e = ((((i23 & 112) ^ 48) > 32 && ir1Var2.m6890g(si2Var)) || (i23 & 48) == 32) | ((((i23 & 896) ^ 384) > 256 && ir1Var2.m6890g(e73Var)) || (i23 & 384) == 256) | ((((i23 & 7168) ^ 3072) > 2048 && ir1Var2.m6892h(false)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) > 16384 && ir1Var2.m6892h(z)) || (i23 & 24576) == 16384) | ir1Var2.m6886e(0) | ((((i23 & 3670016) ^ 1572864) > 1048576 && ir1Var2.m6890g(c0779iz3)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) > 8388608 && ir1Var2.m6890g(c0816jz3)) || (i23 & 12582912) == 8388608) | ((((i23 & 234881024) ^ 100663296) > 67108864 && ir1Var2.m6890g(interfaceC1188tn3)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) > 536870912 && ir1Var2.m6890g(interfaceC1299wn3)) || (i23 & 805306368) == 536870912) | ir1Var2.m6890g(au1Var) | ir1Var2.m6890g(h50Var);
            Object objM6869O4 = ir1Var2.m6869O();
            Object obj3 = objM6869O4;
            if (zM6886e || objM6869O4 == i50Var) {
                li2 li2Var = new li2();
                li2Var.f24046a = si2Var;
                li2Var.f24047b = z;
                li2Var.f24048c = e73Var;
                li2Var.f24049d = hh3Var;
                li2Var.f24050e = interfaceC1299wn3;
                li2Var.f24051f = interfaceC1188tn3;
                li2Var.f24052g = zo0Var;
                li2Var.f24053h = au1Var;
                li2Var.f24054i = h50Var;
                li2Var.f24055j = c0779iz3;
                li2Var.f24056k = c0816jz3;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(li2Var);
                obj3 = li2Var;
            }
            li2 li2Var2 = (li2) obj3;
            d63 d63Var = z ? d63.f16814a : d63.f16815b;
            if (z2) {
                ir1Var2.m6885d0(-2077147368);
                boolean zM6886e2 = ((((i15 & 14) ^ 6) > 4 && ir1Var2.m6890g(si2Var)) || (i15 & 6) == 4) | ir1Var2.m6886e(0);
                Object objM6869O5 = ir1Var2.m6869O();
                Object obj4 = objM6869O5;
                if (zM6886e2 || objM6869O5 == i50Var) {
                    ei2 ei2Var = new ei2();
                    ei2Var.f18120a = si2Var;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(ei2Var);
                    obj4 = ei2Var;
                }
                nt2VarM3229H = as4.m3229H((ei2) obj4, si2Var.f30309o, d63Var);
                ir1Var2.m6912r(false);
            } else {
                ir1Var2.m6885d0(-2076718545);
                ir1Var2.m6912r(false);
                nt2VarM3229H = kt2.f23428a;
            }
            boolean z8 = i21 == 32;
            Object objM6869O6 = ir1Var2.m6869O();
            if (z8 || objM6869O6 == i50Var) {
                xh2 xh2Var2 = new xh2((byte) 1);
                xh2Var2.f34280b = si2Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(xh2Var2);
                obj = xh2Var2;
            } else {
                obj = objM6869O6;
            }
            wp1 wp1Var = (wp1) obj;
            k30 k30Var = (k30) ir1Var2.m6898k(m30.f24616a);
            df2 df2Var = (df2) ir1Var2.m6898k(ij0.f21479n);
            boolean zM6890g = ir1Var2.m6890g(wp1Var);
            C0779iz c0779iz4 = c0779iz3;
            if (((i18 & 14) ^ 6) > 4 && ir1Var2.m6892h(false)) {
                z4 = true;
            } else if ((i18 & 6) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zM6886e3 = zM6890g | z4 | ir1Var2.m6886e(df2Var.ordinal()) | ir1Var2.m6890g(k30Var) | (((i19 ^ 48) > 32 && ir1Var2.m6892h(z)) || (i18 & 48) == 32);
            Object objM6869O7 = ir1Var2.m6869O();
            Object obj5 = objM6869O7;
            if (zM6886e3 || objM6869O7 == i50Var) {
                pc4 pc4Var = new pc4();
                pc4Var.f27522b = wp1Var;
                pc4Var.f27523c = df2Var;
                pc4Var.f27524d = z;
                pc4Var.f27525e = k30Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(pc4Var);
                obj5 = pc4Var;
            }
            pc4 pc4Var2 = (pc4) obj5;
            nt2Var2 = nt2Var;
            nt2 nt2VarM46A = C0006a5.m46A(lb5.m7911T(nt2Var2.mo7630d(si2Var.f30306l).mo7630d(si2Var.f30307m), hh3Var, yh2Var2, d63Var, z2).mo7630d(nt2VarM3229H), si2Var.f30308n);
            interfaceC1299wn2 = interfaceC1299wn3;
            interfaceC1188tn2 = interfaceC1188tn3;
            d63 d63Var2 = d63Var;
            c0816jz2 = c0816jz3;
            si2Var2 = si2Var;
            ir1 ir1Var3 = ir1Var2;
            lb5.m7930k(hh3Var, i25.m6604C(nt2VarM46A, si2Var, d63Var2, c1289wd, z2, xh1Var, si2Var.f30301g, pc4Var2), si2Var2.f30310p, li2Var2, ir1Var3, 0);
            z3 = z2;
            c0779iz2 = c0779iz4;
            ir1Var = ir1Var3;
        } else {
            nt2Var2 = nt2Var;
            si2Var2 = si2Var;
            z3 = z2;
            ir1 ir1Var4 = ir1Var2;
            ir1Var4.m6874W();
            interfaceC1299wn2 = interfaceC1299wn;
            c0816jz2 = c0816jz;
            interfaceC1188tn2 = interfaceC1188tn;
            ir1Var = ir1Var4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ji2 ji2Var = new ji2();
            ji2Var.f22299a = nt2Var2;
            ji2Var.f22300b = si2Var2;
            ji2Var.f22301c = e73Var;
            ji2Var.f22302d = z;
            ji2Var.f22303e = xh1Var;
            ji2Var.f22304f = z3;
            ji2Var.f22305g = c1289wd;
            ji2Var.f22306h = c0779iz2;
            ji2Var.f22307i = interfaceC1299wn2;
            ji2Var.f22308j = c0816jz2;
            ji2Var.f22309k = interfaceC1188tn2;
            ji2Var.f22310l = yp1Var;
            ji2Var.f22311m = i;
            ji2Var.f22312n = i2;
            ji2Var.f22313o = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ji2Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final i14 m7605f(wf2 wf2Var, boolean z) {
        mt2 mt2Var = (mt2) wf2Var.f33299G.f25610g;
        px0 px0Var = null;
        if ((mt2Var.f25198d & 8) != 0) {
            loop0: while (mt2Var != null) {
                if ((mt2Var.f25197c & 8) == 0) {
                    if ((mt2Var.f25198d & 8) != 0) {
                        break;
                        break;
                    }
                    mt2Var = mt2Var.f25200f;
                } else {
                    mt2 mt2VarM10644P = mt2Var;
                    uw2 uw2Var = null;
                    while (mt2VarM10644P != null) {
                        if (mt2VarM10644P instanceof g14) {
                            px0Var = mt2VarM10644P;
                            break loop0;
                        }
                        if ((mt2VarM10644P.f25197c & 8) != 0 && (mt2VarM10644P instanceof qx0)) {
                            int i = 0;
                            for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                if ((mt2Var2.f25197c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mt2VarM10644P = mt2Var2;
                                    } else {
                                        if (uw2Var == null) {
                                            uw2Var = new uw2(new mt2[16]);
                                        }
                                        if (mt2VarM10644P != null) {
                                            uw2Var.m11663b(mt2VarM10644P);
                                            mt2VarM10644P = null;
                                        }
                                        uw2Var.m11663b(mt2Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mt2VarM10644P = sc6.m10644P(uw2Var);
                    }
                    if ((mt2Var.f25198d & 8) != 0) {
                        break;
                    }
                    mt2Var = mt2Var.f25200f;
                }
            }
        }
        mt2 mt2Var3 = ((mt2) ((g14) px0Var)).f25195a;
        e14 e14VarM12297x = wf2Var.m12297x();
        if (e14VarM12297x == null) {
            e14VarM12297x = new e14();
        }
        return new i14(mt2Var3, z, wf2Var, e14VarM12297x);
    }

    /* JADX INFO: renamed from: g */
    public static final l45 m7606g(tz4 tz4Var) {
        if (tz4Var.equals(s02.f29787b)) {
            return m45.f24646a;
        }
        return tz4Var.equals(s02.f29786a) ? m45.f24647b : new l45(tz4Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m7607h(ThreadPoolExecutor threadPoolExecutor, int i, ey0 ey0Var) {
        r50 r50Var = i41.f21117b;
        threadPoolExecutor.setKeepAliveTime(i41.m6647f(((i41) ey0Var.m13553a("gad:thread_keep_alive_time", zy5.m13887v(10, m41.SECONDS), C0033as.a$6)).f21121a), TimeUnit.MILLISECONDS);
        if (i > threadPoolExecutor.getMaximumPoolSize()) {
            threadPoolExecutor.setMaximumPoolSize(i);
            threadPoolExecutor.setCorePoolSize(i);
        } else {
            threadPoolExecutor.setCorePoolSize(i);
            threadPoolExecutor.setMaximumPoolSize(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m7608i(bj4 bj4Var, Context context, lj4 lj4Var, boolean z, tk4 tk4Var, wp1 wp1Var) {
        Resources resources = context.getResources();
        cz3 cz3Var = new cz3((byte) 11);
        cz3Var.f16638b = wp1Var;
        cz3Var.f16639c = tk4Var;
        VarHandle.storeStoreFence();
        if (z) {
            Object obj = lj4Var.f24086a;
            String string = resources.getString(lj4Var.f24087b);
            int i = lj4Var.f24088c;
            kj4 kj4Var = new kj4(obj);
            kj4Var.f23180b = string;
            kj4Var.f23181c = i;
            kj4Var.f23182d = cz3Var;
            VarHandle.storeStoreFence();
            bj4Var.f15334a.m4200a(kj4Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m7609j(bj4 bj4Var, zo0 zo0Var, Context context, lj4 lj4Var, boolean z, yp1 yp1Var) {
        jp1 jp1Var = new jp1((byte) 25);
        jp1Var.f22485b = zo0Var;
        jp1Var.f22486c = yp1Var;
        VarHandle.storeStoreFence();
        m7608i(bj4Var, context, lj4Var, z, null, jp1Var);
    }

    /* JADX INFO: renamed from: k */
    public static int m7610k(double d) {
        double d2 = (d + 16.0d) / 116.0d;
        double d3 = d > 8.0d ? d2 * d2 * d2 : d / 903.2962962962963d;
        double d4 = d2 * d2 * d2;
        boolean z = d4 > 0.008856451679035631d;
        double d5 = z ? d4 : d / 903.2962962962963d;
        if (!z) {
            d4 = d / 903.2962962962963d;
        }
        float[] fArr = f23395d;
        double d6 = d5 * ((double) fArr[0]);
        double d7 = d3 * ((double) fArr[1]);
        double d8 = d4 * ((double) fArr[2]);
        double[][] dArr = f23397f;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[2] * d8) + (dArr2[1] * d7) + (dArr2[0] * d6);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[2] * d8) + (dArr3[1] * d7) + (dArr3[0] * d6);
        double[] dArr4 = dArr[2];
        return ((m7612m(d9) & 255) << 16) | (-16777216) | ((m7612m(d10) & 255) << 8) | (m7612m((dArr4[2] * d8) + (dArr4[1] * d7) + (dArr4[0] * d6)) & 255);
    }

    /* JADX INFO: renamed from: l */
    public static final float m7611l(gv0 gv0Var, float f, float f2) {
        sq4 sq4Var = sw4.f30612a;
        ii1 ii1Var = gv0Var.f20145a;
        C0494bk c0494bk = new C0494bk(0.0f);
        int i = 0;
        while (i < 1) {
            c0494bk.mo3610e(ii1Var.mo5961f(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f), i);
            i++;
        }
        return c0494bk.f15339a;
    }

    /* JADX INFO: renamed from: m */
    public static int m7612m(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    /* JADX INFO: renamed from: n */
    public static final int m7613n(List list, int i) {
        int i2;
        byte b;
        int i3 = ((n73) hb0.m6306R0(list)).f25499c;
        if (i > ((n73) hb0.m6306R0(list)).f25499c) {
            r32.m10186a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            n73 n73Var = (n73) list.get(i2);
            if (n73Var.f25498b > i) {
                b = 1;
            } else {
                b = n73Var.f25499c <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        int size2 = list.size();
        String strM13170a = yl2.m13170a(list, null, new kr2((byte) 6), 31);
        StringBuilder sbM13624x = zi4.m13624x("Found paragraph index ", i2, " should be in range [0, ", size2, ").\nDebug info: index=");
        sbM13624x.append(i);
        sbM13624x.append(", paragraphs=[");
        sbM13624x.append(strM13170a);
        sbM13624x.append("]");
        r32.m10186a(sbM13624x.toString());
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static final int m7614o(List list, int i) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            n73 n73Var = (n73) list.get(i3);
            if (n73Var.f25500d > i) {
                b = 1;
            } else {
                b = n73Var.f25501e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: p */
    public static final int m7615p(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((n73) hb0.m6306R0(arrayList)).f25503g) {
            return kx5.m7689T(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            n73 n73Var = (n73) arrayList.get(i2);
            if (n73Var.f25502f > f) {
                b = 1;
            } else {
                b = n73Var.f25503g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: q */
    public static final void m7616q(ArrayList arrayList, long j, yp1 yp1Var) {
        int size = arrayList.size();
        for (int iM7613n = m7613n(arrayList, ql4.m9903g(j)); iM7613n < size; iM7613n++) {
            n73 n73Var = (n73) arrayList.get(iM7613n);
            if (n73Var.f25498b >= ql4.m9902f(j)) {
                return;
            }
            if (n73Var.f25498b != n73Var.f25499c) {
                yp1Var.invoke(n73Var);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Rect m7617r(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    /* JADX INFO: renamed from: s */
    public static final jc2 m7618s(jc2 jc2Var) {
        if (jc2Var.mo15d().mo5887h()) {
            return jc2Var;
        }
        h23 h23Var = new h23();
        h23Var.f20281a = jc2Var;
        g24 g24VarMo15d = jc2Var.mo15d();
        h24 h24Var = new h24();
        h24Var.f20283a = g24VarMo15d;
        h24Var.f20284b = g24VarMo15d.mo3641b() + '?';
        h24Var.f20285c = n40.m8500i(g24VarMo15d);
        VarHandle.storeStoreFence();
        h23Var.f20282b = h24Var;
        VarHandle.storeStoreFence();
        return h23Var;
    }

    /* JADX INFO: renamed from: t */
    public static final int m7619t(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C1077qn.m9987m("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: u */
    public static final int m7620u(C0879lo c0879lo, Object obj, int i) {
        int i2 = c0879lo.f24219c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM10024h = qq2.m10024h(c0879lo.f24217a, i2, i);
            if (iM10024h < 0 || z62.m13387o(obj, c0879lo.f24218b[iM10024h])) {
                return iM10024h;
            }
            int i3 = iM10024h + 1;
            while (i3 < i2 && c0879lo.f24217a[i3] == i) {
                if (z62.m13387o(obj, c0879lo.f24218b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM10024h - 1; i4 >= 0 && c0879lo.f24217a[i4] == i; i4--) {
                if (z62.m13387o(obj, c0879lo.f24218b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            C1077qn.m9983c();
            return 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public static int m7621v(float f) {
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
        float[] fArr = f23395d;
        return gd0.m5971a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m7622w(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: x */
    public static float m7623x(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: z */
    public static final yq2 m7624z(mr3 mr3Var, int i, int i2, int i3, int i4, int i5, zq2 zq2Var, List list, db3[] db3VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            sq2 sq2Var = (sq2) list2.get(i14);
            float fM13044y = y70.m13044y(y70.m13043x(sq2Var));
            if (fM13044y > 0.0f) {
                f2 += fM13044y;
                i15++;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                db3 db3VarMo5826e = db3VarArr[i14];
                if (db3VarMo5826e == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    db3VarMo5826e = sq2Var.mo5826e(mr3Var.mo4521d(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                db3 db3Var = db3VarMo5826e;
                int iMo4523h = mr3Var.mo4523h(db3Var);
                int iMo4522e = mr3Var.mo4522e(db3Var);
                iArr2[i10 - i6] = iMo4523h;
                int i18 = i17 - iMo4523h;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iMo4523h + iMin;
                iMax = Math.max(iMax, iMo4522e);
                db3VarArr[i10] = db3Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j = j;
        }
        long j2 = j;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i19 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(y70.m13044y(y70.m13043x((sq2) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (db3VarArr[i21] == null) {
                    sq2 sq2Var2 = (sq2) list2.get(i21);
                    f = f3;
                    nr3 nr3VarM13043x = y70.m13043x(sq2Var2);
                    float fM13044y2 = y70.m13044y(nr3VarM13043x);
                    if (fM13044y2 <= 0.0f) {
                        o32.m8935b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fM13044y2 * f) + iSignum);
                    db3 db3VarMo5826e2 = sq2Var2.mo5826e(mr3Var.mo4521d((!(nr3VarM13043x != null ? nr3VarM13043x.f26056b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo4523h2 = mr3Var.mo4523h(db3VarMo5826e2);
                    int iMo4522e2 = mr3Var.mo4522e(db3VarMo5826e2);
                    iArr2[i21 - i6] = iMo4523h2;
                    i23 += iMo4523h2;
                    int iMax3 = Math.max(i22, iMo4522e2);
                    db3VarArr[i21] = db3VarMo5826e2;
                    i22 = iMax3;
                    jRound = j4;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i23) + j3);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        mr3Var.mo4520c(iMax4, iArr2, iArr3, zq2Var);
        return mr3Var.mo4524j(db3VarArr, zq2Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    /* JADX INFO: renamed from: B */
    public abstract int m7625B();

    /* JADX INFO: renamed from: y */
    public abstract void m7626y(int i);
}
