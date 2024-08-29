package io.github.orionlibs.orion_shell;

public class ShellCommandResult
{
    private boolean errorExists;
    private String result;
    private String error;


    public ShellCommandResult(String result)
    {
        this.result = result;
        this.error = "";
    }


    public ShellCommandResult(boolean errorExists, String error)
    {
        this.result = "";
        this.errorExists = errorExists;
        this.error = error;
    }


    public boolean isErrorExists()
    {
        return this.errorExists;
    }


    public String getResult()
    {
        return this.result;
    }


    public String getError()
    {
        return this.error;
    }
}