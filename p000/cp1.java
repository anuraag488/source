package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 {

    /* JADX INFO: renamed from: a */
    public List f16330a;

    /* JADX INFO: renamed from: b */
    public List f16331b;

    static {
        int i = pe3.f27565d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp1)) {
            return false;
        }
        cp1 cp1Var = (cp1) obj;
        if (!this.f16330a.equals(cp1Var.f16330a) || !this.f16331b.equals(cp1Var.f16331b)) {
            return false;
        }
        v71 v71Var = v71.f32439a;
        return v71Var.equals(v71Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((((((((((this.f16331b.hashCode() + (this.f16330a.hashCode() * 31)) * 31) + 1) * 31) - 1206844448) * 31) + 1342627687) * 31) + 1742773122) * 961);
    }

    public final String toString() {
        return "FreemiumConfig(premiumProducts=" + this.f16330a + ", premiumFeatures=" + this.f16331b + ", oldPremiumProducts=" + v71.f32439a + ", bannerAdId=ca-app-pub-9158627376176162/3214584219, interstitialAdId=ca-app-pub-9158627376176162/1775000729, rewardedAdId=ca-app-pub-9158627376176162/7145908487, oldPremiumOnlyApp=null, hasTrial=true)";
    }
}
