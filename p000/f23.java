package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class f23 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final b71 f18673a;

    /* JADX INFO: renamed from: b */
    public gl3 f18674b;

    public f23(gl3 gl3Var, b71 b71Var) {
        this.f18673a = b71Var;
        this.f18674b = gl3Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            if (gl3Var != null) {
                gl3Var.closeConnection();
                this.f18674b = null;
            }
            this.f18673a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.m6034b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        gl3 gl3Var = this.f18674b;
        if (gl3Var != null) {
            return gl3Var.setSelection(i, i2);
        }
        return false;
    }
}
