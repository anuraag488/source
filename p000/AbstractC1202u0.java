package p000;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1202u0 implements po0 {
    private final qo0 key;

    public AbstractC1202u0(qo0 qo0Var) {
        this.key = qo0Var;
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public /* bridge */ <E extends po0> E get(qo0 qo0Var) {
        return (E) AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.po0
    public final qo0 getKey() {
        return this.key;
    }

    @Override // p000.ro0
    public /* bridge */ ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }
}
