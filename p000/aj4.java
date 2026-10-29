package p000;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aj4 {

    /* JADX INFO: renamed from: a */
    public CharSequence f14542a;

    /* JADX INFO: renamed from: b */
    public long f14543b;

    /* JADX INFO: renamed from: c */
    public TextClassification f14544c;

    /* JADX INFO: renamed from: d */
    public ArrayList f14545d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj4)) {
            return false;
        }
        aj4 aj4Var = (aj4) obj;
        return z62.m13387o(this.f14542a, aj4Var.f14542a) && ql4.m9899c(this.f14543b, aj4Var.f14543b) && z62.m13387o(this.f14544c, aj4Var.f14544c) && this.f14545d.equals(aj4Var.f14545d);
    }

    public final int hashCode() {
        int iHashCode = this.f14542a.hashCode() * 31;
        long j = this.f14543b;
        int i = ql4.f28557c;
        return this.f14545d.hashCode() + ((this.f14544c.hashCode() + zi4.m13612l(iHashCode, j, 31)) * 31);
    }

    public final String toString() {
        CharSequence charSequence = this.f14542a;
        return "TextClassificationResult(text=" + ((Object) charSequence) + ", selection=" + ql4.m9905i(this.f14543b) + ", textClassification=" + this.f14544c + ", icons=" + this.f14545d + ")";
    }
}
