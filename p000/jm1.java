package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 {

    /* JADX INFO: renamed from: a */
    public String f22419a;

    /* JADX INFO: renamed from: b */
    public String f22420b;

    /* JADX INFO: renamed from: c */
    public List f22421c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm1)) {
            return false;
        }
        jm1 jm1Var = (jm1) obj;
        return Objects.equals(this.f22419a, jm1Var.f22419a) && Objects.equals(this.f22420b, jm1Var.f22420b) && Objects.equals(this.f22421c, jm1Var.f22421c);
    }

    public final int hashCode() {
        return Objects.hash(this.f22419a, this.f22420b, this.f22421c);
    }
}
