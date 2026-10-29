package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s30 {

    /* JADX INFO: renamed from: a */
    @s24("is_browser_custom_tabs_capable")
    public Boolean f29854a;

    public s30(int i) {
        this.f29854a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s30) && z62.m13387o(this.f29854a, ((s30) obj).f29854a);
    }

    public final int hashCode() {
        Boolean bool = this.f29854a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "BrowserSignals(isDefaultBrowserCustomTabsCapable=" + this.f29854a + ")";
    }

    public s30() {
        this(0);
    }
}
