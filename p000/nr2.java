package p000;

import android.media.session.MediaSessionManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr2 implements MediaSessionManager.OnActiveSessionsChangedListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sw2 f26054a;

    @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
    public final void onActiveSessionsChanged(List list) {
        sw2 sw2Var = this.f26054a;
        if (list == null) {
            list = v71.f32439a;
        }
        sw2Var.setValue(list);
    }
}
