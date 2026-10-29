package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rs2 implements fw3 {

    /* JADX INFO: renamed from: a */
    public AbstractC1240v1 f29578a;

    /* JADX INFO: renamed from: b */
    public pu4 f29579b;

    /* JADX INFO: renamed from: c */
    public sc1 f29580c;

    @Override // p000.fw3
    /* JADX INFO: renamed from: a */
    public final void mo5828a(Object obj, Object obj2) {
        jw3.m7313k(this.f29579b, obj, obj2);
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: b */
    public final void mo5829b(Object obj) {
        this.f29579b.getClass();
        nu4 nu4Var = ((tr1) obj).unknownFields;
        if (nu4Var.f26102e) {
            nu4Var.f26102e = false;
        }
        this.f29580c.getClass();
        c75.m3884p(obj);
        throw null;
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: c */
    public final boolean mo5830c(Object obj) {
        this.f29580c.getClass();
        c75.m3884p(obj);
        throw null;
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: d */
    public final Object mo5831d() {
        AbstractC1240v1 abstractC1240v1 = this.f29578a;
        return abstractC1240v1 instanceof tr1 ? ((tr1) abstractC1240v1).m11110s() : abstractC1240v1.mo11102d().m9629c();
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: e */
    public final void mo5832e(Object obj, ar3 ar3Var) {
        this.f29580c.getClass();
        c75.m3884p(obj);
        throw null;
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: f */
    public final int mo5833f(tr1 tr1Var) {
        this.f29579b.getClass();
        return tr1Var.unknownFields.hashCode();
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: g */
    public final void mo5834g(Object obj, xa0 xa0Var, qc1 qc1Var) {
        pu4 pu4Var = this.f29579b;
        sc1 sc1Var = this.f29580c;
        pu4Var.getClass();
        pu4.m9678a(obj);
        sc1Var.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: h */
    public final int mo5835h(tr1 tr1Var) {
        this.f29579b.getClass();
        nu4 nu4Var = tr1Var.unknownFields;
        int i = nu4Var.f26101d;
        if (i != -1) {
            return i;
        }
        int iM13055a = 0;
        for (int i2 = 0; i2 < nu4Var.f26098a; i2++) {
            int i3 = nu4Var.f26099b[i2] >>> 3;
            iM13055a += ya0.m13055a(3, (t50) nu4Var.f26100c[i2]) + ya0.m13060f(i3) + ya0.m13059e(2) + (ya0.m13059e(1) * 2);
        }
        nu4Var.f26101d = iM13055a;
        return iM13055a;
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: i */
    public final void mo5836i(Object obj, byte[] bArr, int i, int i2, C1411zn c1411zn) {
        tr1 tr1Var = (tr1) obj;
        if (tr1Var.unknownFields == nu4.f26097f) {
            tr1Var.unknownFields = nu4.m8851c();
        }
        throw zi4.m13616p(obj);
    }

    @Override // p000.fw3
    /* JADX INFO: renamed from: j */
    public final boolean mo5837j(tr1 tr1Var, tr1 tr1Var2) {
        this.f29579b.getClass();
        return tr1Var.unknownFields.equals(tr1Var2.unknownFields);
    }
}
