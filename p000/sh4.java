package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sh4 {

    /* JADX INFO: renamed from: a */
    public final String f30278a;

    /* JADX INFO: renamed from: b */
    public final boolean f30279b;

    /* JADX INFO: renamed from: c */
    public final List f30280c;

    /* JADX INFO: renamed from: d */
    public final List f30281d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public sh4(String str, boolean z, List list, List list2) {
        this.f30278a = str;
        this.f30279b = z;
        this.f30280c = list;
        this.f30281d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.f30281d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sh4) {
            sh4 sh4Var = (sh4) obj;
            String str = sh4Var.f30278a;
            if (this.f30279b == sh4Var.f30279b && this.f30280c.equals(sh4Var.f30280c) && z62.m13387o(this.f30281d, sh4Var.f30281d)) {
                String str2 = this.f30278a;
                return od4.m9043X(str2, "index_", false) ? od4.m9043X(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30278a;
        return this.f30281d.hashCode() + ((this.f30280c.hashCode() + ((((od4.m9043X(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f30279b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f30278a);
        sb.append("',\n            |   unique = '");
        sb.append(this.f30279b);
        sb.append("',\n            |   columns = {");
        id4.m6766M(hb0.m6305Q0(this.f30280c, ",", null, null, 0, null, 62));
        id4.m6766M("},");
        ju4 ju4Var = ju4.f22634a;
        sb.append(ju4Var);
        sb.append("\n            |   orders = {");
        id4.m6766M(hb0.m6305Q0(this.f30281d, ",", null, null, 0, null, 62));
        id4.m6766M(" }");
        sb.append(ju4Var);
        sb.append("\n            |}\n        ");
        return id4.m6766M(id4.m6768O(sb.toString()));
    }
}
