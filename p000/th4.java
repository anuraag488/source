package p000;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class th4 {

    /* JADX INFO: renamed from: a */
    public final String f31173a;

    /* JADX INFO: renamed from: b */
    public final Map f31174b;

    /* JADX INFO: renamed from: c */
    public final Set f31175c;

    /* JADX INFO: renamed from: d */
    public final Set f31176d;

    public th4(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f31173a = str;
        this.f31174b = map;
        this.f31175c = abstractSet;
        this.f31176d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th4)) {
            return false;
        }
        th4 th4Var = (th4) obj;
        if (!this.f31173a.equals(th4Var.f31173a) || !this.f31174b.equals(th4Var.f31174b) || !this.f31175c.equals(th4Var.f31175c)) {
            return false;
        }
        Set set2 = this.f31176d;
        if (set2 == null || (set = th4Var.f31176d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f31175c.hashCode() + ((this.f31174b.hashCode() + (this.f31173a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f31173a);
        sb.append("',\n            |    columns = {");
        sb.append(zp0.m13693y(hb0.m6315a1(this.f31174b.values(), new vl1((byte) 24))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(zp0.m13693y(this.f31175c));
        sb.append("\n            |    indices = {");
        Set set = this.f31176d;
        sb.append(zp0.m13693y(set != null ? hb0.m6315a1(set, new vl1((byte) 25)) : v71.f32439a));
        sb.append("\n            |}\n        ");
        return id4.m6768O(sb.toString());
    }
}
