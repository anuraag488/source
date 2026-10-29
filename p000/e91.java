package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e91 extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ dp4 f17904i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ wp1 f17905j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f17906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e91(dp4 dp4Var, wp1 wp1Var, int i) {
        super(2);
        this.f17904i = dp4Var;
        this.f17905j = wp1Var;
        this.f17906k = i;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM11838V = vd6.m11838V(this.f17906k | 1);
        k91.m7436a(this.f17904i, this.f17905j, (mi0) obj, iM11838V);
        return ju4.f22634a;
    }
}
