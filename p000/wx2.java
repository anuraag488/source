package p000;

import android.content.res.Configuration;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class wx2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f33821a = {new jw2(wx2.class, "theme", "getTheme(Lessentials/data/Settings;)Lessentials/FeatureTheme;", 1), new jw2(wx2.class, "centerButtonsInTabletMode", "getCenterButtonsInTabletMode(Lessentials/data/Settings;)Z", 1), new jw2(wx2.class, "buttons", "getButtons(Lessentials/data/Settings;)Ljava/util/List;", 1), new jw2(wx2.class, "gestures", "getGestures(Lessentials/data/Settings;)Ljava/util/Map;", 1)};

    /* JADX INFO: renamed from: b */
    public static final tt2 f33822b = h44.m6219c("nav_bar_theme", new ie1(null, fe1.PrimaryContainer, qd1.f28394a), ie1.Companion.serializer());

    /* JADX INFO: renamed from: c */
    public static final tt2 f33823c;

    /* JADX INFO: renamed from: d */
    public static final tt2 f33824d;

    /* JADX INFO: renamed from: e */
    public static final tt2 f33825e;

    /* JADX INFO: renamed from: f */
    public static final d83 f33826f;

    static {
        Boolean bool = Boolean.FALSE;
        f33823c = h44.m6219c("center_nav_bar_buttons_in_tablet_mode", bool, a10.f32a);
        f33824d = h44.m6219c("nav_bar_buttons_3", kx5.m7694Y(new vx2(new sn0("back", "default_back"), null), new vx2(new sn0("home", "default_home"), new sn0("circle_to_search", "default_home_long")), new vx2(new sn0("recent_apps", "default_recent_apps"), null)), new C0534co(vx2.Companion.serializer()));
        f33825e = h44.m6219c("gestures", w71.f33134a, new ll2(oh6.m9109o("navbar.NavBarGesture", xx2.values()), sn0.Companion.serializer()));
        f33826f = k43.m7398w(bool);
    }

    /* JADX INFO: renamed from: a */
    public static final List m12433a(a44 a44Var) {
        return (List) f33824d.m11153t(a44Var, f33821a[2]);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12434b(a44 a44Var) {
        return ((Boolean) f33823c.m11153t(a44Var, f33821a[1])).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static final Map m12435c(a44 a44Var) {
        return (Map) f33825e.m11153t(a44Var, f33821a[3]);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m12436d(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(442522494);
        if (((Boolean) f33826f.getValue()).booleanValue()) {
            ir1Var.m6912r(false);
            return true;
        }
        boolean z = ((Configuration) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14650a)).smallestScreenWidthDp >= 600;
        ir1Var.m6912r(false);
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static final void m12437e(a44 a44Var, List list) {
        ic2 ic2Var = f33821a[2];
        f33824d.m11144C(a44Var, list);
    }
}
