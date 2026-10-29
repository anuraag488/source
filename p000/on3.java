package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class on3 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f26912i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ rn3 f26913j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on3(rn3 rn3Var, byte b) {
        super(1);
        this.f26912i = b;
        this.f26913j = rn3Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f26912i;
        ju4 ju4Var = ju4.f22634a;
        rn3 rn3Var = this.f26913j;
        switch (b) {
            case 0:
                ((jp3) obj).m7264w(b33.m3428f(rn3Var.m10376c()));
                break;
            case 1:
                ((jp3) obj).m7263v(b33.m3427e(rn3Var.m10376c()));
                break;
            case 2:
                ((jp3) obj).m7264w(b33.m3428f(((b33) rn3Var.f29459t.m8328d()).f15059a));
                break;
            default:
                ((jp3) obj).m7263v(b33.m3427e(((b33) rn3Var.f29459t.m8328d()).f15059a));
                break;
        }
        return ju4Var;
    }
}
