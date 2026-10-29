package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.http.HttpEngine;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bv1 {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m3695A(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m3696B(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m3697C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m3698D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ MeasurementManager m3701c(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ HttpEngine.Builder m3709k(Context context) {
        return new HttpEngine.Builder(context);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ DeleteGesture m3710l(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m3711m(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ HandwritingGesture m3712n(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m3713o(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m3714p(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m3715q(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ Class m3716r() {
        return MeasurementManager.class;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m3719u() {
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m3721w(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ HandwritingGesture m3724z(Object obj) {
        return (HandwritingGesture) obj;
    }
}
