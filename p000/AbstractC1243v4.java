package p000;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1243v4 {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ Class m11718A() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m11719B() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ InsertGesture m11729j(Object obj) {
        return (InsertGesture) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ SelectGesture m11730k(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ Class m11731l() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m11737r(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ Class m11741v() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m11742w(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ Class m11743x() {
        return DeleteRangeGesture.class;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ Class m11744y() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ Class m11745z() {
        return JoinOrSplitGesture.class;
    }
}
