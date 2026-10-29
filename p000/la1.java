package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class la1 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f23888a;

    static {
        bs4 bs4VarM10362b = rl3.m10362b(xz4.class);
        C0598e4 c0598e4 = new C0598e4((byte) 6);
        c0598e4.f17678b = bs4VarM10362b;
        VarHandle.storeStoreFence();
        f23888a = as4.m3263v(c0598e4);
    }

    /* JADX INFO: renamed from: a */
    public static final void m7885a(pg0 pg0Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1245600232);
        byte b = 2;
        if (ir1Var.m6871T(i & 1, (i & 3) != 2)) {
            xz4 xz4Var = (xz4) ir1Var.m6898k(f23888a);
            sw2 sw2VarM7369C = k43.m7369C(pg0Var, ir1Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                C1039pm c1039pm = new C1039pm(b);
                c1039pm.f27741b = sw2VarM7369C;
                VarHandle.storeStoreFence();
                objM6869O = new wz4(-1, new pg0(-724501116, true, c1039pm), null);
                ir1Var.m6905n0(objM6869O);
            }
            wz4 wz4Var = (wz4) objM6869O;
            boolean zM6890g = ir1Var.m6890g(xz4Var);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6890g || objM6869O2 == i50Var) {
                ja1 ja1Var = new ja1((byte) 1);
                ja1Var.f22131b = xz4Var;
                ja1Var.f22132c = wz4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ja1Var);
                obj = ja1Var;
            }
            lb5.m7923d(wz4Var, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            h02 h02Var = new h02(b);
            h02Var.f20244b = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = h02Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m7886b(xz4 xz4Var, pg0 pg0Var, of4 of4Var) {
        ic2[] ic2VarArr = zz2.f36502a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Collections.singletonMap("sheet", ju4.f22634a));
        linkedHashMap.putAll(w71.f33134a);
        kr3 kr3Var = new kr3(linkedHashMap, pg0Var);
        C0928n c0928n = new C0928n((byte) 7);
        c0928n.f25353b = kr3Var;
        VarHandle.storeStoreFence();
        return xz4Var.m12799b(new pg0(-2074583807, true, c0928n), of4Var);
    }
}
