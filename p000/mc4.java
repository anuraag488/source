package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mc4 {

    /* JADX INFO: renamed from: a */
    public k44 f24819a;

    /* JADX INFO: renamed from: b */
    public List f24820b;

    /* JADX INFO: renamed from: a */
    public final k44 m8274a() {
        return this.f24819a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc4)) {
            return false;
        }
        mc4 mc4Var = (mc4) obj;
        return this.f24819a == mc4Var.f24819a && this.f24820b.equals(mc4Var.f24820b);
    }

    public final int hashCode() {
        return this.f24820b.hashCode() + (this.f24819a.hashCode() * 31);
    }

    public final String toString() {
        return "StaticConfig(minSeverity=" + this.f24819a + ", logWriterList=" + this.f24820b + ')';
    }
}
