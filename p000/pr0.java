package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pr0 {

    /* JADX INFO: renamed from: a */
    public final int f27907a;

    /* JADX INFO: renamed from: b */
    public final int f27908b;

    /* JADX INFO: renamed from: c */
    public final int f27909c;

    /* JADX INFO: renamed from: d */
    public final int f27910d;

    public pr0(String str) {
        String[] strArrSplit = str.split("\\.");
        this.f27907a = Integer.parseInt(strArrSplit[0]);
        this.f27908b = Integer.parseInt(strArrSplit[1]);
        this.f27909c = Integer.parseInt(strArrSplit[2]);
        this.f27910d = Integer.parseInt(strArrSplit[3]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27907a);
        sb.append('.');
        sb.append(this.f27908b);
        sb.append('.');
        sb.append(this.f27909c);
        sb.append('.');
        sb.append(this.f27910d);
        return sb.toString();
    }
}
