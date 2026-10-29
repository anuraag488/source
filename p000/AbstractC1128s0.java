package p000;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1128s0 implements pn0 {
    public final String toString() {
        String title = getTitle();
        String description = getDescription();
        on0 on0VarMo6045a = mo6045a();
        boolean z = mo6047c() != null;
        StringBuilder sbM13625y = zi4.m13625y("ControlState(title='", title, "', description=", description, ", status=");
        sbM13625y.append(on0VarMo6045a);
        sbM13625y.append(", fire=");
        sbM13625y.append(z);
        sbM13625y.append(")");
        return sbM13625y.toString();
    }
}
