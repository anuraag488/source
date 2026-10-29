package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ni4 extends ji4 {

    /* JADX INFO: renamed from: c */
    public Runnable f25873c;

    @Override // java.lang.Runnable
    public final void run() {
        this.f25873c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f25873c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ev0.m5354d0(runnable));
        sb.append(", ");
        sb.append(this.f22317a);
        sb.append(", ");
        sb.append(this.f22318b ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
