package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jv4 implements po0 {

    /* JADX INFO: renamed from: a */
    public jv4 f22694a;

    /* JADX INFO: renamed from: b */
    public ru0 f22695b;

    /* JADX INFO: renamed from: c */
    public final void m7298c(lt0 lt0Var) {
        if (this.f22695b == lt0Var) {
            C1077qn.m9989o("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        jv4 jv4Var = this.f22694a;
        if (jv4Var != null) {
            jv4Var.m7298c(lt0Var);
        }
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public final /* bridge */ po0 get(qo0 qo0Var) {
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.po0
    public final qo0 getKey() {
        return gb5.f19724o;
    }

    @Override // p000.ro0
    public final /* bridge */ ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }
}
