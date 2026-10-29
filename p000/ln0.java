package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ln0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f24190a = {new hh3(ln0.class, "LocalControlSettings", "getLocalControlSettings()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f24191b = hj0.m6413a();

    /* JADX INFO: renamed from: c */
    public static final Map f24192c = eq2.m5274M(new l73("app_launcher", new jh0(24)), new l73("assistant", new jh0(19)), new l73("auto_rotation", new jh0(20)), new l73("back", new jh0(21)), new l73("camera", new jh0(22)), new l73("circle_to_search", new jh0(23)), new l73("flashlight", new jh0(25)), new l73("home", new jh0(26)), new l73("last_app", new jh0(27)), new l73("lock_screen", new jh0(28)), new l73("media", new jh0(29)), new l73("notifications", new en0(0)), new l73("power_dialog", new en0(1)), new l73("quick_settings", new en0(2)), new l73("recent_apps", new en0(3)), new l73("screenshot", new en0(4)), new l73("scroll_to_top", new en0(5)), new l73("search", new en0(6)), new l73("shortcut", new jh0(17)), new l73("snapchat", new jh0(18)));

    /* JADX INFO: renamed from: d */
    public static final kj0 f24193d = as4.m3262u(new fj0((byte) 2));

    /* JADX INFO: renamed from: e */
    public static final nc4 f24194e = new nc4(new fj0((byte) 3));

    /* JADX INFO: renamed from: f */
    public static final nc4 f24195f = new nc4(new fj0((byte) 4));

    /* JADX INFO: renamed from: a */
    public static gn0 m8039a(String str, String str2, pg0 pg0Var, on0 on0Var, yp1 yp1Var, yp1 yp1Var2, int i) {
        wm0 wm0Var = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            on0Var = on0.f26898c;
        }
        if ((i & 16) != 0) {
            yp1Var = null;
        }
        if ((i & 32) != 0) {
            yp1Var2 = yp1Var != null ? new fn0(yp1Var, wm0Var, (byte) 0) : null;
        }
        gn0 gn0Var = new gn0();
        gn0Var.f19964a = str;
        gn0Var.f19965b = str2;
        gn0Var.f19966c = pg0Var;
        gn0Var.f19967d = on0Var;
        gn0Var.f19968e = yp1Var;
        gn0Var.f19969f = yp1Var2;
        VarHandle.storeStoreFence();
        return gn0Var;
    }

    /* JADX INFO: renamed from: b */
    public static final pn0 m8040b(sn0 sn0Var, String str, mi0 mi0Var) {
        pn0 pn0VarM8039a;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(182072721);
        Map map = (Map) ir1Var.m6898k(f24193d);
        ir1Var.m6879a0(-1121767268, sn0Var);
        mq1 mq1Var = (mq1) map.get(sn0Var.f30400a);
        i50 i50Var = ki0.f23136a;
        if (mq1Var == null) {
            ir1Var.m6885d0(-415021580);
            yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
            pg0 pg0Var = qq2.f28684c;
            on0 on0Var = on0.f26896a;
            boolean zM6890g = ir1Var.m6890g(yp1VarM5366p0);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == i50Var) {
                objM6869O = new C0873li(yp1VarM5366p0, null, (byte) 2);
                ir1Var.m6905n0(objM6869O);
            }
            pn0VarM8039a = m8039a("Error", "Please reconfigure action", pg0Var, on0Var, null, (yp1) objM6869O, 80);
            ir1Var.m6912r(false);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-414747695);
            ir1Var.m6912r(false);
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new LinkedHashSet();
                ir1Var.m6905n0(objM6869O2);
            }
            Set set = (Set) objM6869O2;
            Object objM6869O3 = ir1Var.m6869O();
            Object obj = objM6869O3;
            if (objM6869O3 == i50Var) {
                jn0 jn0Var = new jn0();
                jn0Var.f22437a = a44Var;
                jn0Var.f22438b = sn0Var;
                jn0Var.f22439c = set;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jn0Var);
                obj = jn0Var;
            }
            ir1Var.m6881b0(m8041c().mo7523a((jn0) obj));
            ir1Var.m6885d0(-1713482063);
            C0613ei c0613ei = new C0613ei((byte) 3);
            c0613ei.f18113c = mq1Var;
            c0613ei.f18114d = str;
            c0613ei.f18115e = sn0Var;
            c0613ei.f18112b = set;
            VarHandle.storeStoreFence();
            gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
            sw2 sw2VarM7369C = k43.m7369C(c0613ei, ir1Var);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj2 = objM6869O4;
            if (objM6869O4 == i50Var) {
                ei0 ei0Var = new ei0();
                ei0Var.f18116a = k43.m7398w(qw3.f28853d);
                ne0 ne0Var = new ne0((byte) 17);
                ne0Var.f25728b = ei0Var;
                ne0Var.f25729c = sw2VarM7369C;
                VarHandle.storeStoreFence();
                ei0Var.f18117b = k43.m7373G(gr1VarM4685N, new pg0(524458028, true, ne0Var));
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ei0Var);
                obj2 = ei0Var;
            }
            pn0VarM8039a = (in0) ((ei0) obj2).f18116a.getValue();
            ir1Var.m6912r(false);
            ir1Var.m6914t();
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(false);
        return pn0VarM8039a;
    }

    /* JADX INFO: renamed from: c */
    public static final xh3 m8041c() {
        return (xh3) f24191b.m9574l(null, f24190a[0]);
    }
}
