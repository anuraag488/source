package p000;

import android.media.session.MediaController;
import android.media.session.PlaybackState;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class or2 extends MediaController.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sw2 f26993a;

    public or2(sw2 sw2Var) {
        this.f26993a = sw2Var;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        this.f26993a.setValue(playbackState);
    }
}
