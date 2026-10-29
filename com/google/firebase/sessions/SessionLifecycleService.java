package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import p000.l34;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: a */
    public final HandlerThread f16319a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: b */
    public l34 f16320b;

    /* JADX INFO: renamed from: c */
    public Messenger f16321c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
        if (messenger != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messenger;
            l34 l34Var = this.f16320b;
            if (l34Var != null) {
                l34Var.sendMessage(messageObtain);
            }
        }
        Messenger messenger2 = this.f16321c;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f16319a;
        handlerThread.start();
        l34 l34Var = new l34(handlerThread.getLooper());
        l34Var.f23770c = new ArrayList();
        VarHandle.storeStoreFence();
        this.f16320b = l34Var;
        this.f16321c = new Messenger(this.f16320b);
        Log.d("SessionLifecycleService", "Service created on process " + Process.myPid());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f16319a.quit();
    }
}
