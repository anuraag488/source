package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g31 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f19552i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ wp1 f19553j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ sw2 f19554k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ zo0 f19555l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ sw2 f19556m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g31(wp1 wp1Var, sw2 sw2Var, zo0 zo0Var, sw2 sw2Var2, byte b) {
        super(0);
        this.f19552i = b;
        this.f19553j = wp1Var;
        this.f19554k = sw2Var;
        this.f19555l = zo0Var;
        this.f19556m = sw2Var2;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f19552i;
        ju4 ju4Var = ju4.f22634a;
        wp1 wp1Var = this.f19553j;
        zo0 zo0Var = this.f19555l;
        sw2 sw2Var = this.f19554k;
        sw2 sw2Var2 = this.f19556m;
        switch (b) {
            case 0:
                x21 x21Var = (x21) sw2Var.getValue();
                if (x21Var != null) {
                    lb5.m7910S(zo0Var, null, null, new e31(x21Var, null, (byte) 2), 3);
                }
                if (((Boolean) sw2Var2.getValue()).booleanValue()) {
                    wp1Var.invoke();
                }
                sw2Var2.setValue(Boolean.FALSE);
                break;
            default:
                x21 x21Var2 = (x21) sw2Var.getValue();
                if (x21Var2 != null) {
                    lb5.m7910S(zo0Var, null, null, new e31(x21Var2, null, (byte) 3), 3);
                }
                if (((Boolean) sw2Var2.getValue()).booleanValue()) {
                    wp1Var.invoke();
                }
                sw2Var2.setValue(Boolean.FALSE);
                break;
        }
        return ju4Var;
    }
}
