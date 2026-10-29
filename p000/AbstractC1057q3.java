package p000;

/* JADX INFO: renamed from: q3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1057q3 {

    /* JADX INFO: renamed from: a */
    public static final pg2 f28187a = AbstractC0647fd.m5647E("M7,23Q6.18,23,5.59,22.41T5,21V3Q5,2.17,5.59,1.59T7,1H17q0.82,0,1.41,0.59T19,3V6.1q0.45,0.18,0.73,0.55T20,7.5v2q0,0.47,-0.27,0.85T19,10.9V21q0,0.82,-0.59,1.41T17,23H7ZM7,3V21H17V3ZM8,9V4h5v2h-3v3ZM16,15v5h-5v-2h3v-3Z");

    /* JADX INFO: renamed from: b */
    public static final pg2 f28188b = AbstractC0647fd.m5647E("M17.5417 3.66669C17.1833 3.66669 16.8417 3.76669 16.5333 3.94169L5.21667 10.74169C4.775 11.00002 4.5 11.48335 4.5 12C4.5 12.5167 4.775 13 5.21667 13.2584L16.5333 20.05C16.8417 20.2334 17.1833 20.325 17.5417 20.325C18.625 20.325 19.5 19.45 19.5 18.3667V5.62502C19.5 4.54169 18.625 3.66669 17.5417 3.66669Z");

    /* JADX INFO: renamed from: c */
    public static final pg2 f28189c = AbstractC0647fd.m5647E("M12.0001 20.3334C7.40008 20.3334 3.66675 16.6 3.66675 12C3.66675 7.40002 7.40008 3.66669 12.0001 3.66669C16.6001 3.66669 20.3334 7.40002 20.3334 12C20.3334 16.6 16.6001 20.3334 12.0001 20.3334Z");

    /* JADX INFO: renamed from: d */
    public static final pg2 f28190d = AbstractC0647fd.m5647E("M6.47634 4.5H17.5241C18.6164 4.5 19.5002 5.38382 19.5002 6.4761V17.5239C19.5002 18.6162 18.6164 19.5 17.5241 19.5H6.47634C5.38407 19.5 4.50024 18.6162 4.50024 17.5239V6.4761C4.50024 5.38382 5.38407 4.5 6.47634 4.5Z");

    /* JADX INFO: renamed from: a */
    public static final gn0 m9718a(int i, String str, pg0 pg0Var, yp1 yp1Var, mi0 mi0Var, int i2, int i3) {
        dz0 dz0VarM10705T;
        yp1 yp1VarM7086b = null;
        yp1 yp1Var2 = (i3 & 8) != 0 ? null : yp1Var;
        boolean z = true;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        ir1 ir1Var = (ir1) mi0Var;
        C1354y3 c1354y3 = (C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a);
        if (z2 || z3) {
            ir1Var.m6885d0(-24826910);
            dz0VarM10705T = se0.m10705T(ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-769605968);
            ir1Var.m6912r(false);
            dz0VarM10705T = null;
        }
        if (z4) {
            ir1Var.m6885d0(-24824151);
            yp1VarM7086b = je0.m7086b(ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-769513712);
            ir1Var.m6912r(false);
        }
        yp1 yp1Var3 = yp1VarM7086b;
        z93 z93VarM10793B = sj3.m10793B(ir1Var, 0, 1);
        boolean zM6890g = ir1Var.m6890g(z93VarM10793B) | ((((458752 & i2) ^ 196608) > 131072 && ir1Var.m6892h(z3)) || (i2 & 196608) == 131072) | ir1Var.m6890g(dz0VarM10705T);
        if ((((57344 & i2) ^ 24576) <= 16384 || !ir1Var.m6892h(z2)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean zM6894i = zM6890g | z | ir1Var.m6894i(yp1Var3) | ir1Var.m6894i(yp1Var2) | ir1Var.m6890g(c1354y3);
        Object objM6869O = ir1Var.m6869O();
        if (zM6894i || objM6869O == ki0.f23136a) {
            C0895m3 c0895m3 = new C0895m3(z93VarM10793B, z3, dz0VarM10705T, z2, c1354y3, i, yp1Var3, yp1Var2, null);
            ir1Var.m6905n0(c0895m3);
            objM6869O = c0895m3;
        }
        return ln0.m8039a(str, null, pg0Var, null, null, (yp1) objM6869O, 90);
    }
}
