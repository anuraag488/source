package p000;

import com.materialkolor.DynamicColorSchemeKt;
import com.materialkolor.ktx.DynamicSchemeKt;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w41 {

    /* JADX INFO: renamed from: a */
    public final mq1 f33075a;

    /* JADX INFO: renamed from: b */
    public final d83 f33076b;

    /* JADX INFO: renamed from: c */
    public final d83 f33077c;

    /* JADX INFO: renamed from: d */
    public final d83 f33078d;

    /* JADX INFO: renamed from: e */
    public final d83 f33079e;

    /* JADX INFO: renamed from: f */
    public final d83 f33080f;

    /* JADX INFO: renamed from: g */
    public final d83 f33081g;

    /* JADX INFO: renamed from: h */
    public final d83 f33082h;

    /* JADX INFO: renamed from: i */
    public final d83 f33083i;

    /* JADX INFO: renamed from: j */
    public final d83 f33084j;

    /* JADX INFO: renamed from: k */
    public final d83 f33085k;

    /* JADX INFO: renamed from: l */
    public final d83 f33086l;

    /* JADX INFO: renamed from: m */
    public final d83 f33087m;

    /* JADX INFO: renamed from: n */
    public final d83 f33088n;

    public w41(long j, boolean z, boolean z2, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, pb0 pb0Var6, mq1 mq1Var) {
        this.f33075a = mq1Var;
        this.f33076b = k43.m7398w(pb0.m9462a(j));
        this.f33077c = k43.m7398w(Boolean.valueOf(z));
        this.f33078d = k43.m7398w(Boolean.valueOf(z2));
        this.f33079e = k43.m7398w(m73Var);
        this.f33080f = k43.m7398w(Double.valueOf(d));
        this.f33081g = k43.m7398w(pc0Var);
        this.f33082h = k43.m7398w(x41Var);
        this.f33083i = k43.m7398w(pb0Var);
        this.f33084j = k43.m7398w(pb0Var2);
        this.f33085k = k43.m7398w(pb0Var3);
        this.f33086l = k43.m7398w(pb0Var4);
        this.f33087m = k43.m7398w(pb0Var5);
        this.f33088n = k43.m7398w(pb0Var6);
    }

    /* JADX INFO: renamed from: a */
    public final dc0 m12071a(ir1 ir1Var, int i) {
        Object obj;
        yp1 yp1Var;
        pb0 pb0Var = (pb0) this.f33083i.getValue();
        Object obj2 = this.f33075a;
        if (obj2 == null) {
            ir1Var.m6885d0(-20094885);
            ir1Var.m6912r(false);
            yp1Var = null;
        } else {
            ir1Var.m6885d0(-20094884);
            boolean zM6890g = ir1Var.m6890g(obj2) | ((((i & 14) ^ 6) > 4 && ir1Var.m6890g(this)) || (i & 6) == 4);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0558d0 c0558d0 = new C0558d0((byte) 28);
                c0558d0.f16655b = obj2;
                c0558d0.f16656c = this;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj = c0558d0;
            }
            obj = objM6869O;
            yp1Var = (yp1) obj;
            ir1Var.m6912r(false);
        }
        yp1 yp1Var2 = yp1Var;
        d83 d83Var = this.f33088n;
        d83 d83Var2 = this.f33087m;
        d83 d83Var3 = this.f33086l;
        d83 d83Var4 = this.f33085k;
        d83 d83Var5 = this.f33084j;
        d83 d83Var6 = this.f33078d;
        if (pb0Var != null) {
            ir1Var.m6885d0(137903459);
            dc0 dc0VarM13905rememberDynamicColorSchemeCdFbwI = DynamicColorSchemeKt.m13905rememberDynamicColorSchemeCdFbwI(pb0Var.f27503a, m12079i(), ((Boolean) d83Var6.getValue()).booleanValue(), (pb0) d83Var5.getValue(), (pb0) d83Var4.getValue(), (pb0) d83Var3.getValue(), (pb0) d83Var2.getValue(), (pb0) d83Var.getValue(), m12077g(), m12072b(), m12076f(), m12074d(), yp1Var2, ir1Var, 0, 0, 0);
            ir1Var.m6912r(false);
            return dc0VarM13905rememberDynamicColorSchemeCdFbwI;
        }
        if (m12078h()) {
            ir1Var.m6885d0(137923726);
            dc0 dc0VarM13906rememberDynamicColorSchemeUQznLDA = DynamicColorSchemeKt.m13906rememberDynamicColorSchemeUQznLDA(m12075e(), m12079i(), ((Boolean) d83Var6.getValue()).booleanValue(), pb0Var, (pb0) d83Var5.getValue(), (pb0) d83Var4.getValue(), (pb0) d83Var3.getValue(), (pb0) d83Var2.getValue(), (pb0) d83Var.getValue(), m12077g(), m12072b(), m12076f(), m12074d(), yp1Var2, ir1Var, 0, 0, 0);
            ir1Var.m6912r(false);
            return dc0VarM13906rememberDynamicColorSchemeUQznLDA;
        }
        ir1Var.m6885d0(137944792);
        dc0 dc0VarM13906rememberDynamicColorSchemeUQznLDA2 = DynamicColorSchemeKt.m13906rememberDynamicColorSchemeUQznLDA(m12075e(), m12079i(), ((Boolean) d83Var6.getValue()).booleanValue(), null, null, null, null, null, null, m12077g(), m12072b(), m12076f(), m12074d(), yp1Var2, ir1Var, 3072, 0, 496);
        ir1Var.m6912r(false);
        return dc0VarM13906rememberDynamicColorSchemeUQznLDA2;
    }

    /* JADX INFO: renamed from: b */
    public final double m12072b() {
        return ((Number) this.f33080f.getValue()).doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public final y41 m12073c(mi0 mi0Var) {
        pb0 pb0Var = (pb0) this.f33083i.getValue();
        d83 d83Var = this.f33088n;
        d83 d83Var2 = this.f33087m;
        d83 d83Var3 = this.f33086l;
        d83 d83Var4 = this.f33085k;
        d83 d83Var5 = this.f33084j;
        if (pb0Var != null) {
            ir1 ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(-311275072);
            y41 y41VarM13940rememberDynamicSchemek1ZVges = DynamicSchemeKt.m13940rememberDynamicSchemek1ZVges(pb0Var.f27503a, m12079i(), pb0Var, (pb0) d83Var5.getValue(), (pb0) d83Var4.getValue(), (pb0) d83Var3.getValue(), (pb0) d83Var2.getValue(), (pb0) d83Var.getValue(), m12077g(), m12072b(), m12076f(), m12074d(), ir1Var, 0, 0, 0);
            ir1Var.m6912r(false);
            return y41VarM13940rememberDynamicSchemek1ZVges;
        }
        if (m12078h()) {
            ir1 ir1Var2 = (ir1) mi0Var;
            ir1Var2.m6885d0(-311256606);
            y41 y41VarM13940rememberDynamicSchemek1ZVges2 = DynamicSchemeKt.m13940rememberDynamicSchemek1ZVges(m12075e(), m12079i(), pb0Var, (pb0) d83Var5.getValue(), (pb0) d83Var4.getValue(), (pb0) d83Var3.getValue(), (pb0) d83Var2.getValue(), (pb0) d83Var.getValue(), m12077g(), m12072b(), m12076f(), m12074d(), ir1Var2, 0, 0, 0);
            ir1Var2.m6912r(false);
            return y41VarM13940rememberDynamicSchemek1ZVges2;
        }
        ir1 ir1Var3 = (ir1) mi0Var;
        ir1Var3.m6885d0(-311238648);
        y41 y41VarM13940rememberDynamicSchemek1ZVges3 = DynamicSchemeKt.m13940rememberDynamicSchemek1ZVges(m12075e(), m12079i(), null, null, null, null, null, null, m12077g(), m12072b(), m12076f(), m12074d(), ir1Var3, 0, 0, 252);
        ir1Var3.m6912r(false);
        return y41VarM13940rememberDynamicSchemek1ZVges3;
    }

    /* JADX INFO: renamed from: d */
    public final x41 m12074d() {
        return (x41) this.f33082h.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final long m12075e() {
        return ((pb0) this.f33076b.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: f */
    public final pc0 m12076f() {
        return (pc0) this.f33081g.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final m73 m12077g() {
        return (m73) this.f33079e.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12078h() {
        List listM7694Y = kx5.m7694Y((pb0) this.f33083i.getValue(), (pb0) this.f33084j.getValue(), (pb0) this.f33085k.getValue(), (pb0) this.f33086l.getValue(), (pb0) this.f33087m.getValue(), (pb0) this.f33088n.getValue());
        if ((listM7694Y instanceof Collection) && listM7694Y.isEmpty()) {
            return false;
        }
        Iterator it = listM7694Y.iterator();
        while (it.hasNext()) {
            if (((pb0) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12079i() {
        return ((Boolean) this.f33077c.getValue()).booleanValue();
    }
}
