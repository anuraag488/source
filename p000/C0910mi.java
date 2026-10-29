package p000;

/* JADX INFO: renamed from: mi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0910mi {

    /* JADX INFO: renamed from: a */
    public final sq4 f24927a;

    /* JADX INFO: renamed from: b */
    public final Object f24928b;

    /* JADX INFO: renamed from: c */
    public final C0457ak f24929c;

    /* JADX INFO: renamed from: d */
    public final d83 f24930d;

    /* JADX INFO: renamed from: e */
    public final d83 f24931e;

    /* JADX INFO: renamed from: f */
    public final ex2 f24932f;

    /* JADX INFO: renamed from: g */
    public final db4 f24933g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0654fk f24934h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0654fk f24935i;

    /* JADX INFO: renamed from: j */
    public AbstractC0654fk f24936j;

    /* JADX INFO: renamed from: k */
    public AbstractC0654fk f24937k;

    public C0910mi(Object obj, sq4 sq4Var, Object obj2) {
        this.f24927a = sq4Var;
        this.f24928b = obj2;
        C0457ak c0457ak = new C0457ak(sq4Var, obj, null, 60);
        this.f24929c = c0457ak;
        this.f24930d = k43.m7398w(Boolean.FALSE);
        this.f24931e = k43.m7398w(obj);
        this.f24932f = new ex2();
        this.f24933g = new db4(obj2);
        AbstractC0654fk abstractC0654fk = c0457ak.f14573c;
        boolean z = abstractC0654fk instanceof C0494bk;
        AbstractC0654fk abstractC0654fk2 = z ? dt0.f17347e : abstractC0654fk instanceof C0530ck ? dt0.f17348f : abstractC0654fk instanceof C0578dk ? dt0.f17349g : dt0.f17350h;
        this.f24934h = abstractC0654fk2;
        AbstractC0654fk abstractC0654fk3 = z ? dt0.f17343a : abstractC0654fk instanceof C0530ck ? dt0.f17344b : abstractC0654fk instanceof C0578dk ? dt0.f17345c : dt0.f17346d;
        this.f24935i = abstractC0654fk3;
        this.f24936j = abstractC0654fk2;
        this.f24937k = abstractC0654fk3;
    }

    /* JADX INFO: renamed from: a */
    public static Object m8325a(C0910mi c0910mi, Object obj, InterfaceC1407zj interfaceC1407zj, yp1 yp1Var, wm0 wm0Var, int i) {
        if ((i & 2) != 0) {
            interfaceC1407zj = c0910mi.f24933g;
        }
        InterfaceC1407zj interfaceC1407zj2 = interfaceC1407zj;
        Object objInvoke = c0910mi.f24927a.f30509b.invoke(c0910mi.f24929c.f14573c);
        if ((i & 8) != 0) {
            yp1Var = null;
        }
        yp1 yp1Var2 = yp1Var;
        Object objM8328d = c0910mi.m8328d();
        sq4 sq4Var = c0910mi.f24927a;
        return ex2.m5420a(c0910mi.f24932f, new C0799ji(c0910mi, objInvoke, new hi4(interfaceC1407zj2, sq4Var, objM8328d, obj, (AbstractC0654fk) sq4Var.f30508a.invoke(objInvoke)), c0910mi.f24929c.f14574d, yp1Var2, null), wm0Var);
    }

    /* JADX INFO: renamed from: b */
    public final Object m8326b(Object obj) {
        if (!z62.m13387o(this.f24936j, this.f24934h) || !z62.m13387o(this.f24937k, this.f24935i)) {
            sq4 sq4Var = this.f24927a;
            AbstractC0654fk abstractC0654fk = (AbstractC0654fk) sq4Var.f30508a.invoke(obj);
            int iMo4034b = abstractC0654fk.mo4034b();
            boolean z = false;
            for (int i = 0; i < iMo4034b; i++) {
                if (abstractC0654fk.mo3608a(i) < this.f24936j.mo3608a(i) || abstractC0654fk.mo3608a(i) > this.f24937k.mo3608a(i)) {
                    abstractC0654fk.mo3610e(sc6.m10674o(abstractC0654fk.mo3608a(i), this.f24936j.mo3608a(i), this.f24937k.mo3608a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return sq4Var.f30509b.invoke(abstractC0654fk);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m8327c() {
        C0457ak c0457ak = this.f24929c;
        c0457ak.f14573c.mo3609d();
        c0457ak.f14574d = Long.MIN_VALUE;
        this.f24930d.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    public final Object m8328d() {
        return this.f24929c.f14572b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8329e() {
        return ((Boolean) this.f24930d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final Object m8330f(wm0 wm0Var, Object obj) {
        Object objM5420a = ex2.m5420a(this.f24932f, new C0836ki(this, obj, null), wm0Var);
        return objM5420a == ap0.f14763a ? objM5420a : ju4.f22634a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m8331g(of4 of4Var) {
        Object objM5420a = ex2.m5420a(this.f24932f, new C0873li(this, null, (byte) 0), of4Var);
        return objM5420a == ap0.f14763a ? objM5420a : ju4.f22634a;
    }

    public /* synthetic */ C0910mi(Object obj, sq4 sq4Var, Object obj2, int i) {
        this(obj, sq4Var, (i & 4) != 0 ? null : obj2);
    }
}
