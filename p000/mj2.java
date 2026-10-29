package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public C0973o7 f24967a;

    /* JADX INFO: renamed from: b */
    public String f24968b;

    /* JADX INFO: renamed from: c */
    public C0641f8 f24969c;

    /* JADX INFO: renamed from: d */
    public AbstractC0640f7 f24970d;

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f24967a != C0973o7.f26400z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mj2) {
            mj2 mj2Var = (mj2) obj;
            return mj2Var.f24969c == this.f24969c && mj2Var.f24970d.equals(this.f24970d) && mj2Var.f24968b.equals(this.f24968b) && mj2Var.f24967a == this.f24967a;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(mj2.class, this.f24968b, this.f24969c, this.f24970d, this.f24967a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f24968b + ", dekParsingStrategy: " + this.f24969c + ", dekParametersForNewKeys: " + this.f24970d + ", variant: " + this.f24967a + ")";
    }
}
