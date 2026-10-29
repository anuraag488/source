package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cv0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f16503a = {new jw2(cv0.class, "isDebug", "isDebug(Lessentials/data/Settings;)Z", 1), new jw2(cv0.class, "showDebug", "getShowDebug(Lessentials/data/Settings;)Z", 1)};

    /* JADX INFO: renamed from: b */
    public static final tt2 f16504b;

    /* JADX INFO: renamed from: c */
    public static final tt2 f16505c;

    /* JADX INFO: renamed from: d */
    public static final kj0 f16506d;

    static {
        Boolean bool = Boolean.FALSE;
        a10 a10Var = a10.f32a;
        f16504b = h44.m6219c("is_debug", bool, a10Var);
        f16505c = h44.m6219c("show_debug", Boolean.TRUE, a10Var);
        bs4 bs4VarM10362b = rl3.m10362b(vg2.class);
        mc2 mc2Var = mc2.f24814a;
        lc2 lc2Var = new lc2(mc2Var, bs4VarM10362b);
        lc2 lc2Var2 = new lc2(mc2Var, rl3.m10362b(ju4.class));
        sl3 sl3Var = rl3.f29396a;
        r90 r90VarM10361a = rl3.m10361a(yp1.class);
        List listAsList = Arrays.asList(lc2Var, lc2Var2);
        sl3Var.getClass();
        bs4 bs4VarM10871b = sl3.m10871b(rl3.m10361a(w94.class), Collections.singletonList(new lc2(mc2Var, sl3.m10871b(r90VarM10361a, listAsList, false))), false);
        C0598e4 c0598e4 = new C0598e4((byte) 4);
        c0598e4.f17678b = bs4VarM10871b;
        VarHandle.storeStoreFence();
        f16506d = as4.m3263v(c0598e4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m4169a(yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1929557833);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(yp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            w94 w94Var = (w94) ir1Var.m6898k(f16506d);
            boolean zM6890g = ir1Var.m6890g(w94Var) | ((i2 & 14) == 4);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0558d0 c0558d0 = new C0558d0((byte) 26);
                c0558d0.f16655b = w94Var;
                c0558d0.f16656c = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj = c0558d0;
            }
            obj = objM6869O;
            lb5.m7923d(yp1Var, (yp1) obj, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            bv0 bv0Var = new bv0();
            bv0Var.f15644a = yp1Var;
            bv0Var.f15645b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = bv0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4170b(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-87339933);
        if (ir1Var.m6871T(i & 1, i != 0)) {
            mz3.m8463e(null, null, false, rz2.m10510c(k43.f22874s, ir1Var), null, null, k43.f22875t, null, k43.f22876u, null, ir1Var, 102236160, 695);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            en0 en0Var = new en0((byte) 13);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = en0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4171c(int i, mi0 mi0Var) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1623581313);
        byte b = 1;
        if (ir1Var.m6871T(i & 1, i != 0)) {
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            boolean zM6890g = ir1Var.m6890g(a44Var) | ir1Var.m6894i(context);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                zu0 zu0Var = new zu0(b);
                zu0Var.f36379b = a44Var;
                zu0Var.f36380c = context;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(zu0Var);
                obj = zu0Var;
            }
            obj = objM6869O;
            AbstractC0647fd.m5668f(null, "Debug", false, null, (yp1) obj, ir1Var, 48, 13);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            en0 en0Var = new en0((byte) 12);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = en0Var;
        }
    }
}
