package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class en5 {

    /* JADX INFO: renamed from: d */
    public static final x12 f18278d = x12.m12457q(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a */
    public String f18279a;

    /* JADX INFO: renamed from: b */
    public final long f18280b;

    /* JADX INFO: renamed from: c */
    public final HashMap f18281c;

    public en5(String str, long j, HashMap map) {
        this.f18279a = str;
        this.f18280b = j;
        HashMap map2 = new HashMap();
        this.f18281c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m5209b(String str, Object obj, Object obj2) {
        if (f18278d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final en5 clone() {
        return new en5(this.f18279a, this.f18280b, new HashMap(this.f18281c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en5)) {
            return false;
        }
        en5 en5Var = (en5) obj;
        if (this.f18280b == en5Var.f18280b && this.f18279a.equals(en5Var.f18279a)) {
            return this.f18281c.equals(en5Var.f18281c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18279a.hashCode() * 31;
        long j = this.f18280b;
        return this.f18281c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f18279a;
        String string = this.f18281c.toString();
        int length = String.valueOf(str).length();
        long j = this.f18280b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
