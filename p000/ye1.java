package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 {

    /* JADX INFO: renamed from: a */
    public final File f35159a;

    /* JADX INFO: renamed from: b */
    public final List f35160b;

    public ye1(File file, List list) {
        this.f35159a = file;
        this.f35160b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye1)) {
            return false;
        }
        ye1 ye1Var = (ye1) obj;
        return this.f35159a.equals(ye1Var.f35159a) && this.f35160b.equals(ye1Var.f35160b);
    }

    public final int hashCode() {
        return this.f35160b.hashCode() + (this.f35159a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f35159a + ", segments=" + this.f35160b + ')';
    }
}
