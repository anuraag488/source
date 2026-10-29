package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f25564i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o91 f25565j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n91(o91 o91Var, byte b) {
        super(1);
        this.f25564i = b;
        this.f25565j = o91Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ag1 ag1Var;
        ag1 ag1Var2;
        byte b = this.f25564i;
        o91 o91Var = this.f25565j;
        switch (b) {
            case 0:
                zo4 zo4Var = (zo4) obj;
                b91 b91Var = b91.f15168a;
                b91 b91Var2 = b91.f15169b;
                Object obj2 = null;
                if (zo4Var.mo10251b(b91Var, b91Var2)) {
                    z70 z70Var = o91Var.f26483s.f27464a.f16336c;
                    if (z70Var != null) {
                        obj2 = z70Var.f35801c;
                    }
                } else if (zo4Var.mo10251b(b91Var2, b91.f15170c)) {
                    z70 z70Var2 = o91Var.f26484t.f24813a.f16336c;
                    if (z70Var2 != null) {
                        obj2 = z70Var2.f35801c;
                    }
                } else {
                    obj2 = k91.f23007e;
                }
                return obj2 == null ? k91.f23007e : obj2;
            default:
                zo4 zo4Var2 = (zo4) obj;
                b91 b91Var3 = b91.f15168a;
                b91 b91Var4 = b91.f15169b;
                if (zo4Var2.mo10251b(b91Var3, b91Var4)) {
                    t74 t74Var = o91Var.f26483s.f27464a.f16335b;
                    return (t74Var == null || (ag1Var2 = t74Var.f30977b) == null) ? k91.f23006d : ag1Var2;
                }
                if (!zo4Var2.mo10251b(b91Var4, b91.f15170c)) {
                    return k91.f23006d;
                }
                t74 t74Var2 = o91Var.f26484t.f24813a.f16335b;
                return (t74Var2 == null || (ag1Var = t74Var2.f30977b) == null) ? k91.f23006d : ag1Var;
        }
    }
}
