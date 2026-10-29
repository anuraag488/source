package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bp4 implements xb4 {

    /* JADX INFO: renamed from: a */
    public final sq4 f15485a;

    /* JADX INFO: renamed from: b */
    public final d83 f15486b;

    /* JADX INFO: renamed from: c */
    public final d83 f15487c;

    /* JADX INFO: renamed from: d */
    public final d83 f15488d;

    /* JADX INFO: renamed from: e */
    public rz3 f15489e;

    /* JADX INFO: renamed from: f */
    public hi4 f15490f;

    /* JADX INFO: renamed from: g */
    public final d83 f15491g;

    /* JADX INFO: renamed from: h */
    public final z73 f15492h;

    /* JADX INFO: renamed from: i */
    public boolean f15493i;

    /* JADX INFO: renamed from: j */
    public final d83 f15494j;

    /* JADX INFO: renamed from: k */
    public AbstractC0654fk f15495k;

    /* JADX INFO: renamed from: l */
    public final b83 f15496l;

    /* JADX INFO: renamed from: m */
    public boolean f15497m;

    /* JADX INFO: renamed from: n */
    public final db4 f15498n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ dp4 f15499o;

    public bp4(dp4 dp4Var, Object obj, AbstractC0654fk abstractC0654fk, sq4 sq4Var) {
        this.f15499o = dp4Var;
        this.f15485a = sq4Var;
        d83 d83VarM7398w = k43.m7398w(obj);
        this.f15486b = d83VarM7398w;
        Object objInvoke = null;
        d83 d83VarM7398w2 = k43.m7398w(qq2.m10014I(0.0f, 0.0f, null, 7));
        this.f15487c = d83VarM7398w2;
        this.f15488d = k43.m7398w(new hi4((ag1) d83VarM7398w2.getValue(), sq4Var, obj, d83VarM7398w.getValue(), abstractC0654fk));
        this.f15491g = k43.m7398w(Boolean.TRUE);
        this.f15492h = new z73(-1.0f);
        this.f15494j = k43.m7398w(obj);
        this.f15495k = abstractC0654fk;
        this.f15496l = new b83(m3654a().mo5814c());
        Float f = (Float) wy4.f33864a.get(sq4Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC0654fk abstractC0654fk2 = (AbstractC0654fk) sq4Var.f30508a.invoke(obj);
            int iMo4034b = abstractC0654fk2.mo4034b();
            for (int i = 0; i < iMo4034b; i++) {
                abstractC0654fk2.mo3610e(fFloatValue, i);
            }
            objInvoke = this.f15485a.f30509b.invoke(abstractC0654fk2);
        }
        this.f15498n = qq2.m10014I(0.0f, 0.0f, objInvoke, 3);
    }

    /* JADX INFO: renamed from: a */
    public final hi4 m3654a() {
        return (hi4) this.f15488d.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m3655b(long j) {
        if (this.f15492h.m13399h() == -1.0f) {
            this.f15497m = true;
            if (z62.m13387o(m3654a().f20605c, m3654a().f20606d)) {
                m3656d(m3654a().f20605c);
            } else {
                m3656d(m3654a().mo5813b(j));
                this.f15495k = m3654a().mo5817f(j);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3656d(Object obj) {
        this.f15494j.setValue(obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m3657f(Object obj, boolean z) {
        InterfaceC1407zj interfaceC1407zj;
        hi4 hi4Var = this.f15490f;
        Object obj2 = hi4Var != null ? hi4Var.f20605c : null;
        d83 d83Var = this.f15486b;
        boolean zM13387o = z62.m13387o(obj2, d83Var.getValue());
        b83 b83Var = this.f15496l;
        d83 d83Var2 = this.f15488d;
        ag1 ag1Var = this.f15498n;
        if (zM13387o) {
            d83Var2.setValue(new hi4(ag1Var, this.f15485a, obj, obj, this.f15495k.mo4035c()));
            this.f15493i = true;
            b83Var.m3513i(m3654a().mo5814c());
            return;
        }
        d83 d83Var3 = this.f15487c;
        if (!z || this.f15497m || (((ag1) d83Var3.getValue()) instanceof db4)) {
            ag1Var = (ag1) d83Var3.getValue();
        }
        dp4 dp4Var = this.f15499o;
        if (dp4Var.m4644f() <= 0) {
            interfaceC1407zj = ag1Var;
        } else {
            long jM4644f = dp4Var.m4644f();
            ob4 ob4Var = new ob4();
            ob4Var.f26542a = ag1Var;
            ob4Var.f26543b = jM4644f;
            VarHandle.storeStoreFence();
            interfaceC1407zj = ob4Var;
        }
        d83Var2.setValue(new hi4(interfaceC1407zj, this.f15485a, obj, d83Var.getValue(), this.f15495k));
        b83Var.m3513i(m3654a().mo5814c());
        this.f15493i = false;
        dp4Var.m4656r(true);
        if (dp4Var.m4648j()) {
            w94 w94Var = dp4Var.f17267j;
            int size = w94Var.size();
            for (int i = 0; i < size; i++) {
                bp4 bp4Var = (bp4) w94Var.get(i);
                bp4Var.f15496l.m3512h();
                bp4Var.m3655b(0L);
            }
            dp4Var.m4656r(false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3658g(Object obj, Object obj2, ag1 ag1Var) {
        this.f15486b.setValue(obj2);
        this.f15487c.setValue(ag1Var);
        if (z62.m13387o(m3654a().f20606d, obj) && z62.m13387o(m3654a().f20605c, obj2)) {
            return;
        }
        m3657f(obj, false);
    }

    @Override // p000.xb4
    public final Object getValue() {
        return this.f15494j.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m3659h(Object obj, ag1 ag1Var, Object obj2, AbstractC0654fk abstractC0654fk) {
        Object value;
        if (this.f15493i) {
            hi4 hi4Var = this.f15490f;
            if (z62.m13387o(obj, hi4Var != null ? hi4Var.f20605c : null)) {
                return;
            }
        }
        d83 d83Var = this.f15486b;
        boolean zM13387o = z62.m13387o(d83Var.getValue(), obj);
        z73 z73Var = this.f15492h;
        if (zM13387o && z73Var.m13399h() == -1.0f && (obj2 == null || obj2.equals(m3654a().f20606d))) {
            return;
        }
        d83Var.setValue(obj);
        this.f15487c.setValue(ag1Var);
        if (obj2 == null) {
            value = z73Var.m13399h() == -3.0f ? obj : this.f15494j.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            m3656d(value);
            if (abstractC0654fk != null) {
                this.f15495k = abstractC0654fk;
            }
        }
        d83 d83Var2 = this.f15491g;
        m3657f(value, !((Boolean) d83Var2.getValue()).booleanValue());
        d83Var2.setValue(Boolean.valueOf(z73Var.m13399h() == -3.0f));
        if (z73Var.m13399h() >= 0.0f) {
            m3656d(m3654a().mo5813b((long) (z73Var.m13399h() * m3654a().mo5814c())));
        } else if (z73Var.m13399h() == -3.0f) {
            m3656d(obj);
        }
        this.f15493i = false;
        z73Var.m13400i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f15494j.getValue() + ", target: " + this.f15486b.getValue() + ", spec: " + ((ag1) this.f15487c.getValue());
    }
}
