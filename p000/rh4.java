package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rh4 {

    /* JADX INFO: renamed from: a */
    public final String f29293a;

    /* JADX INFO: renamed from: b */
    public final String f29294b;

    /* JADX INFO: renamed from: c */
    public final String f29295c;

    /* JADX INFO: renamed from: d */
    public final List f29296d;

    /* JADX INFO: renamed from: e */
    public final List f29297e;

    public rh4(String str, String str2, String str3, List list, List list2) {
        this.f29293a = str;
        this.f29294b = str2;
        this.f29295c = str3;
        this.f29296d = list;
        this.f29297e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh4)) {
            return false;
        }
        rh4 rh4Var = (rh4) obj;
        if (z62.m13387o(this.f29293a, rh4Var.f29293a) && z62.m13387o(this.f29294b, rh4Var.f29294b) && z62.m13387o(this.f29295c, rh4Var.f29295c) && this.f29296d.equals(rh4Var.f29296d)) {
            return this.f29297e.equals(rh4Var.f29297e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29297e.hashCode() + ((this.f29296d.hashCode() + zi4.m13613m(zi4.m13613m(this.f29293a.hashCode() * 31, this.f29294b, 31), this.f29295c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f29293a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f29294b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f29295c);
        sb.append("',\n            |   columnNames = {");
        id4.m6766M(hb0.m6305Q0(hb0.m6314Z0(this.f29296d), ",", null, null, 0, null, 62));
        id4.m6766M("},");
        ju4 ju4Var = ju4.f22634a;
        sb.append(ju4Var);
        sb.append("\n            |   referenceColumnNames = {");
        id4.m6766M(hb0.m6305Q0(hb0.m6314Z0(this.f29297e), ",", null, null, 0, null, 62));
        id4.m6766M(" }");
        sb.append(ju4Var);
        sb.append("\n            |}\n        ");
        return id4.m6766M(id4.m6768O(sb.toString()));
    }
}
