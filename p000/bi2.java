package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15311a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ di2 f15312b;

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f15311a;
        di2 di2Var = this.f15312b;
        switch (b) {
            case 0:
                si2 si2Var = di2Var.f17076p.f35226b;
                return Float.valueOf((si2Var.m10788g() * 500) + ((a83) si2Var.f30299e.f19663c).m132h());
            case 1:
                si2 si2Var2 = di2Var.f17076p.f35226b;
                int iM10788g = si2Var2.m10788g();
                int iM132h = ((a83) si2Var2.f30299e.f19663c).m132h();
                return Float.valueOf(si2Var2.mo6020c() ? (iM10788g * 500) + iM132h + 100.0f : (iM10788g * 500) + iM132h);
            default:
                si2 si2Var3 = di2Var.f17076p.f35226b;
                int iM8333i = (int) (si2Var3.m10789h().f24955p == d63.f16814a ? si2Var3.m10789h().m8333i() & 4294967295L : si2Var3.m10789h().m8333i() >> 32);
                si2 si2Var4 = di2Var.f17076p.f35226b;
                return Float.valueOf(iM8333i - ((-si2Var4.m10789h().f24952m) + si2Var4.m10789h().f24956q));
        }
    }
}
