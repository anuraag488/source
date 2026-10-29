package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pg0 implements mq1, nq1, oq1, pq1, qq1, rq1, sq1, tq1, xp1, zp1, bq1, cq1, dq1, eq1, fq1, gq1, hq1, jq1, kq1 {

    /* JADX INFO: renamed from: a */
    public final int f27584a;

    /* JADX INFO: renamed from: b */
    public final boolean f27585b;

    /* JADX INFO: renamed from: c */
    public Object f27586c;

    /* JADX INFO: renamed from: d */
    public yk3 f27587d;

    /* JADX INFO: renamed from: e */
    public ArrayList f27588e;

    public pg0(int i, boolean z, Object obj) {
        this.f27584a = i;
        this.f27585b = z;
        this.f27586c = obj;
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9512a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ir1 ir1Var, Integer num) {
        return m9515f(obj, bool, obj2, obj3, obj4, ir1Var, num.intValue());
    }

    /* JADX INFO: renamed from: b */
    public final Object m9513b(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(this.f27584a);
        m9519k(ir1Var);
        int iM11846e = i | (ir1Var.m6890g(this) ? vd6.m11846e(2, 0) : vd6.m11846e(1, 0));
        Object obj = this.f27586c;
        as4.m3259r(2, obj);
        Object objInvoke = ((mq1) obj).invoke(ir1Var, Integer.valueOf(iM11846e));
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new og0(2, this, pg0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 0);
        }
        return objInvoke;
    }

    @Override // p000.qq1
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo6204c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m9518j(obj, obj2, obj3, obj4, (mi0) obj5, ((Number) obj6).intValue());
    }

    @Override // p000.pq1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo6994d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m9517i(obj, obj2, obj3, (mi0) obj4, ((Number) obj5).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final Object m9514e(Object obj, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(this.f27584a);
        m9519k(ir1Var);
        int iM11846e = ir1Var.m6890g(this) ? vd6.m11846e(2, 1) : vd6.m11846e(1, 1);
        Object obj2 = this.f27586c;
        as4.m3259r(3, obj2);
        Object objInvoke = ((nq1) obj2).invoke(obj, ir1Var, Integer.valueOf(iM11846e | i));
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mg0 mg0Var = new mg0((byte) 0);
            mg0Var.f24879c = this;
            mg0Var.f24880d = obj;
            mg0Var.f24878b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mg0Var;
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: f */
    public final Object m9515f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(this.f27584a);
        m9519k(ir1Var);
        int iM11846e = ir1Var.m6890g(this) ? vd6.m11846e(2, 6) : vd6.m11846e(1, 6);
        Object obj5 = this.f27586c;
        as4.m3259r(8, obj5);
        Object objMo9512a = ((sq1) obj5).mo9512a(obj, bool, obj2, obj3, obj4, ir1Var, Integer.valueOf(iM11846e | i));
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ng0 ng0Var = new ng0();
            ng0Var.f25762a = this;
            ng0Var.f25763b = obj;
            ng0Var.f25764c = bool;
            ng0Var.f25765d = obj2;
            ng0Var.f25766e = obj3;
            ng0Var.f25767f = obj4;
            ng0Var.f25768g = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ng0Var;
        }
        return objMo9512a;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        return m9516h(obj, obj2, (mi0) obj3, ((Number) obj4).intValue());
    }

    /* JADX INFO: renamed from: h */
    public final Object m9516h(Object obj, Object obj2, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(this.f27584a);
        m9519k(ir1Var);
        int iM11846e = ir1Var.m6890g(this) ? vd6.m11846e(2, 2) : vd6.m11846e(1, 2);
        Object obj3 = this.f27586c;
        as4.m3259r(4, obj3);
        Object objMo183g = ((oq1) obj3).mo183g(obj, obj2, ir1Var, Integer.valueOf(iM11846e | i));
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 3);
            c1403zf.f36038e = this;
            c1403zf.f36036c = obj;
            c1403zf.f36037d = obj2;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
        return objMo183g;
    }

    /* JADX INFO: renamed from: i */
    public final Object m9517i(Object obj, Object obj2, Object obj3, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(this.f27584a);
        m9519k(ir1Var);
        byte b = 3;
        int iM11846e = ir1Var.m6890g(this) ? vd6.m11846e(2, 3) : vd6.m11846e(1, 3);
        Object obj4 = this.f27586c;
        as4.m3259r(5, obj4);
        Object objMo6994d = ((pq1) obj4).mo6994d(obj, obj2, obj3, ir1Var, Integer.valueOf(iM11846e | i));
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm(b);
            c0877lm.f24144c = this;
            c0877lm.f24145d = obj;
            c0877lm.f24146e = obj2;
            c0877lm.f24147f = obj3;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
        return objMo6994d;
    }

    @Override // p000.mq1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m9513b(((Number) obj2).intValue(), (mi0) obj);
    }

    /* JADX INFO: renamed from: j */
    public final Object m9518j(Object obj, Object obj2, Object obj3, Object obj4, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(this.f27584a);
        m9519k(ir1Var);
        byte b = 1;
        int iM11846e = ir1Var.m6890g(this) ? vd6.m11846e(2, 4) : vd6.m11846e(1, 4);
        Object obj5 = this.f27586c;
        as4.m3259r(6, obj5);
        Object objMo6204c = ((qq1) obj5).mo6204c(obj, obj2, obj3, obj4, ir1Var, Integer.valueOf(iM11846e | i));
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0963ny c0963ny = new C0963ny(b);
            c0963ny.f26182b = this;
            c0963ny.f26184d = obj;
            c0963ny.f26185e = obj2;
            c0963ny.f26186f = obj3;
            c0963ny.f26187g = obj4;
            c0963ny.f26183c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0963ny;
        }
        return objMo6204c;
    }

    /* JADX INFO: renamed from: k */
    public final void m9519k(mi0 mi0Var) {
        yk3 yk3VarM6855A;
        if (!this.f27585b || (yk3VarM6855A = ((ir1) mi0Var).m6855A()) == null) {
            return;
        }
        yk3VarM6855A.f35298b |= 1;
        yk3 yk3Var = this.f27587d;
        if (yk3Var == null || !yk3Var.m13152a() || yk3Var == yk3VarM6855A || z62.m13387o(yk3Var.f35299c, yk3VarM6855A.f35299c)) {
            this.f27587d = yk3VarM6855A;
            return;
        }
        ArrayList arrayList = this.f27588e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f27588e = arrayList2;
            arrayList2.add(yk3VarM6855A);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yk3 yk3Var2 = (yk3) arrayList.get(i);
            if (yk3Var2 == null || !yk3Var2.m13152a() || yk3Var2 == yk3VarM6855A || z62.m13387o(yk3Var2.f35299c, yk3VarM6855A.f35299c)) {
                arrayList.set(i, yk3VarM6855A);
                return;
            }
        }
        arrayList.add(yk3VarM6855A);
    }

    /* JADX INFO: renamed from: l */
    public final void m9520l(iq1 iq1Var) {
        if (this.f27586c.equals(iq1Var)) {
            return;
        }
        this.f27586c = iq1Var;
        if (this.f27585b) {
            yk3 yk3Var = this.f27587d;
            if (yk3Var != null) {
                zk3 zk3Var = yk3Var.f35297a;
                if (zk3Var != null) {
                    zk3Var.mo13320f(yk3Var, null);
                }
                this.f27587d = null;
            }
            ArrayList arrayList = this.f27588e;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    yk3 yk3Var2 = (yk3) arrayList.get(i);
                    zk3 zk3Var2 = yk3Var2.f35297a;
                    if (zk3Var2 != null) {
                        zk3Var2.mo13320f(yk3Var2, null);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // p000.nq1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m9514e(obj, (mi0) obj2, ((Number) obj3).intValue());
    }
}
