package p000;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g84 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f19654a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ma0 f19655b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f19656c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ yp1 f19657d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f19658e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ float f19659f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ wp1 f19660g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((sc2) obj).f30158a;
        wp1 wp1Var = this.f19660g;
        boolean z = this.f19658e;
        float f = this.f19659f;
        yp1 yp1Var = this.f19657d;
        ma0 ma0Var = this.f19655b;
        if (!this.f19654a) {
            return Boolean.FALSE;
        }
        int iM10083H = qs5.m10083H(keyEvent);
        if (iM10083H != 2) {
            if (iM10083H != 1) {
                return Boolean.FALSE;
            }
            if (z) {
                long jM6579d = i20.m6579d(keyEvent.getKeyCode());
                if (!nc2.m8689a(jM6579d, nc2.f25650d) && !nc2.m8689a(jM6579d, nc2.f25637F) && !nc2.m8689a(jM6579d, nc2.f25651e) && !nc2.m8689a(jM6579d, nc2.f25638G) && !nc2.m8689a(jM6579d, nc2.f25668v) && !nc2.m8689a(jM6579d, nc2.f25641J) && !nc2.m8689a(jM6579d, nc2.f25669w) && !nc2.m8689a(jM6579d, nc2.f25642K) && !nc2.m8689a(jM6579d, nc2.f25634C) && !nc2.m8689a(jM6579d, nc2.f25643L) && !nc2.m8689a(jM6579d, nc2.f25635D) && !nc2.m8689a(jM6579d, nc2.f25644M)) {
                    return Boolean.FALSE;
                }
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                return Boolean.TRUE;
            }
            long jM6579d2 = i20.m6579d(keyEvent.getKeyCode());
            if (!nc2.m8689a(jM6579d2, nc2.f25653g) && !nc2.m8689a(jM6579d2, nc2.f25640I) && !nc2.m8689a(jM6579d2, nc2.f25652f) && !nc2.m8689a(jM6579d2, nc2.f25639H) && !nc2.m8689a(jM6579d2, nc2.f25668v) && !nc2.m8689a(jM6579d2, nc2.f25641J) && !nc2.m8689a(jM6579d2, nc2.f25669w) && !nc2.m8689a(jM6579d2, nc2.f25642K) && !nc2.m8689a(jM6579d2, nc2.f25634C) && !nc2.m8689a(jM6579d2, nc2.f25643L) && !nc2.m8689a(jM6579d2, nc2.f25635D) && !nc2.m8689a(jM6579d2, nc2.f25644M)) {
                return Boolean.FALSE;
            }
            if (wp1Var != null) {
                wp1Var.invoke();
            }
            return Boolean.TRUE;
        }
        float f2 = ma0Var.f24779b;
        float f3 = ma0Var.f24778a;
        float fAbs = Math.abs(f2 - f3) / 100.0f;
        int i = this.f19656c ? -1 : 1;
        if (nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25668v) || nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25641J)) {
            yp1Var.invoke(Float.valueOf(f3));
            return Boolean.TRUE;
        }
        if (nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25669w) || nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25642K)) {
            yp1Var.invoke(Float.valueOf(ma0Var.f24779b));
            return Boolean.TRUE;
        }
        if (z) {
            long jM6579d3 = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d3, nc2.f25650d) || nc2.m8689a(jM6579d3, nc2.f25637F)) {
                yp1Var.invoke(sc6.m10678s(Float.valueOf(f - (i * fAbs)), ma0Var));
                return Boolean.TRUE;
            }
            if (nc2.m8689a(jM6579d3, nc2.f25651e) || nc2.m8689a(jM6579d3, nc2.f25638G)) {
                yp1Var.invoke(sc6.m10678s(Float.valueOf((i * fAbs) + f), ma0Var));
                return Boolean.TRUE;
            }
            if (nc2.m8689a(jM6579d3, nc2.f25634C) || nc2.m8689a(jM6579d3, nc2.f25643L)) {
                yp1Var.invoke(sc6.m10678s(Float.valueOf(f - ((sc6.m10675p(10, 1, 10) * i) * fAbs)), ma0Var));
                return Boolean.TRUE;
            }
            if (!nc2.m8689a(jM6579d3, nc2.f25635D) && !nc2.m8689a(jM6579d3, nc2.f25644M)) {
                return Boolean.FALSE;
            }
            yp1Var.invoke(sc6.m10678s(Float.valueOf((sc6.m10675p(10, 1, 10) * i * fAbs) + f), ma0Var));
            return Boolean.TRUE;
        }
        long jM6579d4 = i20.m6579d(keyEvent.getKeyCode());
        if (nc2.m8689a(jM6579d4, nc2.f25653g) || nc2.m8689a(jM6579d4, nc2.f25640I)) {
            yp1Var.invoke(sc6.m10678s(Float.valueOf((i * fAbs) + f), ma0Var));
            return Boolean.TRUE;
        }
        if (nc2.m8689a(jM6579d4, nc2.f25652f) || nc2.m8689a(jM6579d4, nc2.f25639H)) {
            yp1Var.invoke(sc6.m10678s(Float.valueOf(f - (i * fAbs)), ma0Var));
            return Boolean.TRUE;
        }
        if (nc2.m8689a(jM6579d4, nc2.f25634C) || nc2.m8689a(jM6579d4, nc2.f25643L)) {
            yp1Var.invoke(sc6.m10678s(Float.valueOf((sc6.m10675p(10, 1, 10) * fAbs) + f), ma0Var));
            return Boolean.TRUE;
        }
        if (!nc2.m8689a(jM6579d4, nc2.f25635D) && !nc2.m8689a(jM6579d4, nc2.f25644M)) {
            return Boolean.FALSE;
        }
        yp1Var.invoke(sc6.m10678s(Float.valueOf(f - (sc6.m10675p(10, 1, 10) * fAbs)), ma0Var));
        return Boolean.TRUE;
    }
}
