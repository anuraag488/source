package p000;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ih4 {

    /* JADX INFO: renamed from: a */
    public MotionEvent.PointerProperties f21421a;

    /* JADX INFO: renamed from: b */
    public MotionEvent.PointerCoords f21422b;

    /* JADX INFO: renamed from: c */
    public long f21423c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih4)) {
            return false;
        }
        ih4 ih4Var = (ih4) obj;
        return this.f21421a.equals(ih4Var.f21421a) && this.f21422b.equals(ih4Var.f21422b) && this.f21423c == ih4Var.f21423c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21423c) + ((this.f21422b.hashCode() + (this.f21421a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        MotionEvent.PointerProperties pointerProperties = this.f21421a;
        MotionEvent.PointerCoords pointerCoords = this.f21422b;
        long j = this.f21423c;
        StringBuilder sb = new StringBuilder("PointerData(props=");
        sb.append(pointerProperties);
        sb.append(", coords=");
        sb.append(pointerCoords);
        sb.append(", downTime=");
        return d55.m4369n(sb, j, ")");
    }
}
