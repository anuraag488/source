package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hx4 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f20914i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ix4 f20915j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx4(ix4 ix4Var, byte b) {
        super(1);
        this.f20914i = b;
        this.f20915j = ix4Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j;
        byte b = this.f20914i;
        ix4 ix4Var = this.f20915j;
        switch (b) {
            case 0:
                zo4 zo4Var = (zo4) obj;
                b91 b91Var = b91.f15168a;
                b91 b91Var2 = b91.f15169b;
                if (zo4Var.mo10251b(b91Var, b91Var2)) {
                    cp4 cp4Var = ix4Var.f21867p.f27464a;
                    return k91.f23005c;
                }
                if (!zo4Var.mo10251b(b91Var2, b91.f15170c)) {
                    return k91.f23005c;
                }
                cp4 cp4Var2 = ix4Var.f21868q.f24813a;
                return k91.f23005c;
            default:
                int iOrdinal = ((b91) obj).ordinal();
                if (iOrdinal == 0) {
                    cp4 cp4Var3 = ix4Var.f21867p.f27464a;
                    j = pb0.f27500g;
                } else if (iOrdinal == 1) {
                    cp4 cp4Var4 = ix4Var.f21867p.f27464a;
                    cp4 cp4Var5 = ix4Var.f21868q.f24813a;
                    j = pb0.f27500g;
                } else {
                    if (iOrdinal != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    cp4 cp4Var6 = ix4Var.f21868q.f24813a;
                    j = ix4Var.f21869r.f15093e;
                }
                return pb0.m9462a(j);
        }
    }
}
