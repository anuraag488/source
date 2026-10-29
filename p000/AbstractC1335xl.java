package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: xl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1335xl {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f34373a = {new hh3(AbstractC1335xl.class, "LocalAppCrashDataStore", "getLocalAppCrashDataStore()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f34374b = hj0.m6413a();

    /* JADX INFO: renamed from: a */
    public static final void m12703a(pg0 pg0Var, mi0 mi0Var, int i) {
        t31 t31Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1659617879);
        if (ir1Var.m6871T(i & 1, (i & 3) != 2)) {
            C1409zl c1409zl = (C1409zl) ir1Var.m6898k(wz0.f33871a);
            wp1 wp1Var = (wp1) ir1Var.m6898k(hj0.f20619a);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new C0515c5((byte) 15);
                ir1Var.m6905n0(objM6869O);
            }
            wp1 wp1Var2 = (wp1) objM6869O;
            boolean zM6890g = ir1Var.m6890g(c1409zl);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6890g || objM6869O2 == i50Var) {
                C0834kg c0834kg = new C0834kg((byte) 1);
                c0834kg.f23102b = c1409zl;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0834kg);
                obj = c0834kg;
            }
            wp1 wp1Var3 = (wp1) obj;
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var) {
                objM6869O3 = new C0515c5((byte) 16);
                ir1Var.m6905n0(objM6869O3);
            }
            wp1 wp1Var4 = (wp1) objM6869O3;
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = new C0891m((byte) 27);
                ir1Var.m6905n0(objM6869O4);
            }
            yp1 yp1Var = (yp1) objM6869O4;
            i92 i92Var = (i92) ir1Var.m6898k(hj0.f20620b);
            boolean zM6890g2 = ir1Var.m6890g(wp1Var3);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O5 == i50Var) {
                C1283w7 c1283w7 = new C1283w7((byte) 3);
                c1283w7.f33127c = wp1Var2;
                c1283w7.f33128d = i92Var;
                c1283w7.f33129e = wp1Var4;
                c1283w7.f33126b = wp1Var3;
                VarHandle.storeStoreFence();
                if (yp1Var != null) {
                    C0797jg c0797jg = new C0797jg((byte) 0);
                    c0797jg.f22228b = yp1Var;
                    VarHandle.storeStoreFence();
                    t31Var = new t31(c0797jg);
                } else {
                    t31Var = null;
                }
                objM6869O5 = o85.m8988f(c1283w7, t31Var, ps1.f27931a, wp1Var3, 4);
                ir1Var.m6905n0(objM6869O5);
            }
            lt0 lt0Var = (lt0) objM6869O5;
            if (ir1Var.m6869O() == i50Var) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                C1186tl c1186tl = new C1186tl();
                c1186tl.f31216a = defaultUncaughtExceptionHandler;
                c1186tl.f31217b = lt0Var;
                c1186tl.f31218c = wp1Var;
                VarHandle.storeStoreFence();
                Thread.setDefaultUncaughtExceptionHandler(c1186tl);
                ir1Var.m6905n0(ju4.f22634a);
            }
            as4.m3244c(((xh3) f34374b.m9574l(null, f34373a[0])).mo7523a(lt0Var), pg0Var, ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            h02 h02Var = new h02((byte) 1);
            h02Var.f20244b = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = h02Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m12704b(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(463174437);
        if (ir1Var.m6871T(i & 1, i != 0)) {
            lt0 lt0Var = (lt0) ir1Var.m6898k((xh3) f34374b.m9574l(null, f34373a[0]));
            sw2 sw2VarM10028l = qq2.m10028l(lt0Var.getData(), v71.f32439a, ir1Var, 48, 2);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            vf1 vf1Var = n74.f25506c;
            boolean zM6890g = ir1Var.m6890g(sw2VarM10028l) | ir1Var.m6894i(lt0Var);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (zM6890g || objM6869O2 == i50Var) {
                C1149sl c1149sl = new C1149sl((byte) 1);
                c1149sl.f30361b = sw2VarM10028l;
                c1149sl.f30362c = sw2Var;
                c1149sl.f30363d = lt0Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1149sl);
                obj = c1149sl;
            }
            AbstractC0647fd.m5668f(vf1Var, "App crashes", false, null, (yp1) obj, ir1Var, 54, 12);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            sg0 sg0Var = new sg0((byte) 12);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = sg0Var;
        }
    }
}
